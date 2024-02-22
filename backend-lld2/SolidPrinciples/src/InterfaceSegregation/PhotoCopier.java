package InterfaceSegregation;

public class PhotoCopier implements Printer, Scanner{

    @Override
    public void print(Document d) {
        // Printer implementation
    }

    @Override
    public void scan(Document d) {
        // Scanner implementation
    }
}
