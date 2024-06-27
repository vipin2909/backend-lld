package stratergies;

import enums.VehicleType;
import models.Gate;
import models.ParkingSlot;

public interface SlotAssignmentStrategy {
    ParkingSlot getSlot(VehicleType vehicleType, Gate gate);
}
