package stratergies;

import enums.ParkingSlotStatus;
import enums.VehicleType;
import models.Gate;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSlot;
import repositories.ParkingLotRepository;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy {

    private ParkingLotRepository parkingLotRepository;

    public RandomSlotAssignmentStrategy(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }
    @Override
    public ParkingSlot getSlot(VehicleType vehicleType, Gate gate) {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotByGateId(gate.getId());

        for(ParkingFloor parkingFloor: parkingLot.getParkingFloors()) {
            for(ParkingSlot parkingSlot: parkingFloor.getParkingSlots()) {
                if(parkingSlot.getVehicleType().equals(vehicleType)
                        && parkingSlot.getParkingSlotStatus().equals(ParkingSlotStatus.UNOCCUPIED)) {
                    return parkingSlot;
                }
            }

        }
        return null;
    }
}
