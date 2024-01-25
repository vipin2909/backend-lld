// OOP

// 1. Software should revolve around entities
// 2. Each entity has its own attributes (info) & also has its own behaviours.

// Example of a student entity

public class Student {

//    public String toString() {
//        return "Student Details:\n\n"+
//                "Name: "+name+"\n"+
//                "Age: "+age+"\n"+
//                "Gender: "+gender+"\n";
//    }
    String name;
    int age;
    String gender;

    void changeBatchName() {
        System.out.println("Change Batch");
    }

    void giveMockInterview() {
        System.out.println("Giving Mock Interview....");
    }
    void print() {
        System.out.println("Student Name: " + name);
    }
}
