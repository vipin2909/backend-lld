package repositories;

import models.Gate;

import java.util.Optional;

public interface GateRepository {
    public Optional<Gate> getGateByGateId(long gateId);
}
