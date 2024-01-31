package accessModifierNew;

import accessModifiers.Student;

public class StudentChild extends Student {
    public static void main(String[] args) {
        StudentChild studentChild = new StudentChild();
        // here we can access batchId because it is subclass of Student in different package and
        // data member is protected
        studentChild.batchId = 234;
        System.out.println(studentChild.batchId);
    }
}
