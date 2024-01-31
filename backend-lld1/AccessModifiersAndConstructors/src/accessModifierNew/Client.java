package accessModifierNew;

import accessModifiers.Student;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        // student.name can't access because name is private attribute
        // student.age age is default only can be accessible in same package
        // student.batchId not able to access batchId because Client is in different package and not a subclass of Student
        student.universityName = "DCE";
        // universityName is accessible because it's a public attribute
    }
}
