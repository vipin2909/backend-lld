package passByValue;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        doSomething(student);
        System.out.println("DEBUG");
        System.out.println(student.age);
    }


    // java is pass by value and the value is address to the object
    private static void doSomething(Student student) {
        student.age = 19;
        System.out.println(student);
//        student = new Student();
        System.out.println(student);

    }
}
