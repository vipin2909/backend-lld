package fluentbuilder;

public class Demo {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person dimtri = pb.withName("Dimtri").build();
    }
}
