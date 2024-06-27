package stratergies;

import enums.SlotAssignmentStrategyType;
import repositories.ParkingLotRepository;

public class SlotAssignmentStrategyFactory {
    public static SlotAssignmentStrategy getSlotAssignmentStrategyByStrategyType(SlotAssignmentStrategyType slotAssignmentStrategyType, ParkingLotRepository parkingLotRepository) {
       if(slotAssignmentStrategyType.equals(SlotAssignmentStrategyType.RANDOM)) {
           return new RandomSlotAssignmentStrategy(parkingLotRepository);
       }
       return null;
    }
}
