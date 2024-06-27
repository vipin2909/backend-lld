package repositories;

import models.Gate;
import models.ParkingLot;

import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepositoryImpl implements ParkingLotRepository {


    // for sorted order we are using treemap here
    private Map<Long, ParkingLot> parkingLots = new TreeMap<>();
    @Override
    public ParkingLot getParkingLotByGateId(long gateId)
    {
        for(ParkingLot parkingLot: parkingLots.values()) {
            for(Gate gate: parkingLot.getGates()) {
                if(gate.getId() == gateId) {
                    return parkingLot;
                }
            }
        }
        return null;
    }
}
