package repositories;

import models.Vehicle;

import java.util.Optional;

public interface VehicleRepository {
    public Optional<Vehicle> getVehicleByVehicleNumber(String vehicleNumber);
    public Vehicle insertVehicle(Vehicle vehicle);
}
