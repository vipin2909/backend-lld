package prototype.udemyExercise;

public class Demo {
    public static void main(String[] args) {
        Line lineOne = new Line(new Point(2, 2), new Point(5, 5));
        Point pointOneStart = lineOne.start;
        Point pointOneEnd = lineOne.end;
        System.out.println(lineOne);

        Line lineTwo = lineOne.deepCopy();
        Point pointTwoStart = lineTwo.start;
        Point pointTwoEnd = lineTwo.end;
        System.out.println(lineTwo);
    }
}
