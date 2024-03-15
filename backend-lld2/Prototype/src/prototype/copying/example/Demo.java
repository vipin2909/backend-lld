package prototype.copying.example;

public class Demo {
    public static void main(String[] args) throws Exception {
        Person john = new Person(new String[]{"john", "smith"}, new Address("London Road", 123));
        // want to create a person which lives next door to john
        // Person john = new Person(new String[]{"john", "smith"}, new Address("London Road", 123));

        // deep copy and shallow copy read about this online

        Person jane = (Person) john.clone();
        jane.names[0] = "Jane";
        jane.address.houseNumber = 124;

        System.out.println(john);
        System.out.println(jane);



    }
}
