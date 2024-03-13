package factory;

public class Demo {
    public static void main(String[] args) {
        Point p = Point.Factory.newCartesianPoint(2, 3);
        System.out.println(p);
    }
}
