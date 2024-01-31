package accessModifiers;

public class Student {
    private String name;
    // default automatically means
    int age;
    protected int batchId;
    public String universityName;

    void updateStudentDetails() {
        name = "vipin";
        age = 24;
        batchId = 123;
        universityName = "MDU";

    }
}
