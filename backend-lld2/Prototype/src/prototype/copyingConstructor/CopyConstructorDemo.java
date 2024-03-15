package prototype.copyingConstructor;

public class CopyConstructorDemo {
    public static void main(String[] args) {
        Employee john = new Employee("john", new Address("123 London Road", "London", "UK"));
        Employee chris = new Employee(john);
        chris.name = "chris";
        chris.address.streetAddress = "124 London Road";
        System.out.println(chris);
        System.out.println(john);
    }
}
