package abstractFactory;

public class TestDesignPattern {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("32 GB", "2 TB", "2.9 GHz"));

        System.out.println("Abstract Factory PC Config: " + pc);
        System.out.println("Abstract Factory Server config: " + server);
    }
}
