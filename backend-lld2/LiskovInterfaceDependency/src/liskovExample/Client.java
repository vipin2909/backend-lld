package liskovExample;

// this example violates the liskov substitution principle
public class Client {
    static void modifyRactangle(Ractangle ractangle, int newWidth, int newHeight) {
        ractangle.setHeight(newHeight);
        ractangle.setWidth(newWidth);
    }

    public static void main(String[] args) {
        Ractangle ractangle = new Square();
        ractangle.setWidth(5);
        ractangle.setHeight(10);

        Ractangle ractangle1 = new Square();
        modifyRactangle(ractangle1, 5, 10);

        int area = ractangle.calculateArea();
        int area2 = ractangle1.calculateArea();

        System.out.println("Area: " + area + "\n" + "Area2: " + area2);
    }
}
