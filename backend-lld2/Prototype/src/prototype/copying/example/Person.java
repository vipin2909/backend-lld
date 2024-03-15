package prototype.copying.example;

import java.util.Arrays;

public class Person {
        public String[] names;
        public Address address;

        public Person(String[] names, Address address) {
            this.names = names;
            this.address = address;
        }


    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }

    // things can be problematic here as names and address are references this is not what we actually want
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Person(names.clone(), (Address) address.clone());
    }
}
