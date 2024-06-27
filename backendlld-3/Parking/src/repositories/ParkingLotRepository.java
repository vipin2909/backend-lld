package repositories;

import models.ParkingLot;

public interface ParkingLotRepository {
    public ParkingLot getParkingLotByGateId(long gateId);
}
