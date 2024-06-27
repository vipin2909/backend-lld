package services;

import enums.ParkingSlotStatus;
import enums.SlotAssignmentStrategyType;
import enums.VehicleType;
import exceptions.GateNotFoundException;
import models.Gate;
import models.ParkingSlot;
import models.Ticket;
import models.Vehicle;
import repositories.GateRepository;
import repositories.ParkingLotRepository;
import repositories.TicketRepository;
import repositories.VehicleRepository;
import stratergies.SlotAssignmentStrategyFactory;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }
    public Ticket bookTicket(long gateId, VehicleType vehicleType, String vehicleNumber, String ownerName) throws GateNotFoundException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> gateOptional = gateRepository.getGateByGateId(gateId);
        if(gateOptional.isEmpty()) {
            throw new GateNotFoundException("Gate number not valid");
        }

        Gate gate = gateOptional.get();
        ticket.setGateGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());

        Vehicle savedVehicle;
        Optional<Vehicle> vehicleOptional = vehicleRepository.getVehicleByVehicleNumber(vehicleNumber);

        if(vehicleOptional.isEmpty()) {
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setNumber(vehicleNumber);
            vehicle.setOwnerName(ownerName);
            savedVehicle = vehicleRepository.insertVehicle(vehicle);
        }

        else {
            savedVehicle = vehicleOptional.get();
        }

        ticket.setVehicle(savedVehicle);

        SlotAssignmentStrategyType slotAssignmentStrategyType = parkingLotRepository.getParkingLotByGateId(gateId).getSlotAssignmentStrategyType();
        ParkingSlot parkingSlot = SlotAssignmentStrategyFactory.getSlotAssignmentStrategyByStrategyType(slotAssignmentStrategyType, parkingLotRepository).getSlot(vehicleType, gate);
        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.OCCUPIED);
        ticket.setParkingSlot(parkingSlot);


        // persist the ticket in db as well
        Ticket savedTicket = ticketRepository.saveTicket(ticket); // comes with the id from the database

        savedTicket.setTicketNumber("TICKET - " + savedTicket.getId());
        return savedTicket;
    }
}
