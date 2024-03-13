package question3;

public class Dog extends Animal {

    private int noOfLegs;
    public Dog(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
    void walking() {
        System.out.println("Dog is walking");
    }
}
