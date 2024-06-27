package models;

import java.util.Date;

public class Ticket extends BaseModel {
    // ticket should have Vehicle
    // ParkingSlot, entryTime, operator, Gate,


    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private String ticketNumber;
    private Gate gateGeneratedAt;
    private Operator generatedBy;
    private Date entryTime;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Gate getGateGeneratedAt() {
        return gateGeneratedAt;
    }

    public void setGateGeneratedAt(Gate gateGeneratedAt) {
        this.gateGeneratedAt = gateGeneratedAt;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }
}
