package factoryMethod;

public class Demo {
    public static void main(String[] args) {
        Point point = Point.newCartesianPoint(2,3);
        Point polarPoint = Point.newPolarPoint(2, 3);

        System.out.println(point+"\n\n");
        System.out.println(polarPoint);
    }
}
