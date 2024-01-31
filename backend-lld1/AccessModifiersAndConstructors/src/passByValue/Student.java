package passByValue;


class Address {
    String state;
    String city;

    Address() {

    }

    Address(String state, String city) {
        this.state = state;
        this.city = city;
    }
}

public class Student {
    String name;
    int age;
    Address address;
}
