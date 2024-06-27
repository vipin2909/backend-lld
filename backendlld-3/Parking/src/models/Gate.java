package models;

import enums.GateStatus;
import enums.GateType;

public class Gate extends BaseModel {
    private GateType gateType;
    private Operator operator;
    private long gateNumber;
    private GateStatus gateStatus;

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public long getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(long gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }




}
