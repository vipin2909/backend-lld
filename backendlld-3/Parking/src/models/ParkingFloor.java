package models;

import enums.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private List<ParkingSlot> parkingSlots;
    private String parkingFloorNumber;
    private ParkingFloorStatus parkingFloorStatus;

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public String getParkingFloorNumber() {
        return parkingFloorNumber;
    }

    public void setParkingFloorNumber(String parkingFloorNumber) {
        this.parkingFloorNumber = parkingFloorNumber;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
