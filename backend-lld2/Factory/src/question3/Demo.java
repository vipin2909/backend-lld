package question3;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Dog(4);
        ((Dog)animal).walking();
        System.out.println(animal.getNoOfLegs());

        Dog dog = new Dog(5);
        System.out.println(dog.getNoOfLegs());

    }
}
