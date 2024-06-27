package models;

public class Operator extends BaseModel {
    private String name;

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    private long emp_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
