package liskovCorrect;


class Ractangle extends Shape {
    int height;
    int width;

    @Override
    public int area() {
        return height * width;
    }
}

class Square extends Shape {
    int side;

    @Override
    public int area() {
        return side * side;
    }
}
public class LiskovCorrect {

    public static void main(String[] args) {
        Shape shape = new Square();
        ((Square) shape).side = 5;

        System.out.println("Shape Area Is: " + shape.area());


        Shape newShape = new Ractangle();
        ((Ractangle) newShape).width = 5;
        ((Ractangle) newShape).height = 10;

        System.out.println("New Shape Area Is: " + newShape.area());
    }

}
