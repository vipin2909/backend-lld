package repositories;

import models.Vehicle;

import java.util.Optional;

public class VehicleRepositoryImpl implements VehicleRepository {
    @Override
    public Optional<Vehicle> getVehicleByVehicleNumber(String vehicleNumber) {
        return Optional.empty();
    }
    @Override
    public Vehicle insertVehicle(Vehicle vehicle) {
        return null;
    }
}
