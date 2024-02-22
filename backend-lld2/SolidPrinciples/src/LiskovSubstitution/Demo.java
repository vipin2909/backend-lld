package LiskovSubstitution;

public class Demo {

    static void useIt(Ractangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        // area = width * 10
        System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
    }

    public static void main(String[] args) {
        Ractangle rc = new Ractangle(2, 3);
        useIt(rc);

        Ractangle sq = new Square();
        sq.setWidth(5);
        useIt(sq);
    }
}
