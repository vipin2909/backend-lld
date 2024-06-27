import controllers.TicketController;
import repositories.*;
import services.TicketService;

public class Client {

    public static void main(String[] args) {

        // GameController -> Service -> Repositories
        ParkingLotRepository parkingLotRepository = new ParkingLotRepositoryImpl();
        TicketRepository ticketRepository = new TicketRepositoryImpl();
        GateRepository gateRepository = new GateRepositoryImpl();
        VehicleRepository vehicleRepository = new VehicleRepositoryImpl();
        TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingLotRepository, ticketRepository);

        TicketController ticketController = new TicketController(ticketService);


    }
}
