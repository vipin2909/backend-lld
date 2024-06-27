package repositories;

import models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepositoryImpl implements GateRepository {


    private Map<Long, Gate> gateMap;

    // this is for now is in memory representation of database
    public GateRepositoryImpl() {
        gateMap = new HashMap<>();
    }

    @Override
    public Optional<Gate> getGateByGateId(long gateId) {
        return gateMap.values().stream().filter(gate -> gate.getId() == gateId).findFirst();
    }
}
