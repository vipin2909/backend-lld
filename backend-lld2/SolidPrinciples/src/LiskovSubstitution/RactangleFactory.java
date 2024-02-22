package LiskovSubstitution;

public class RactangleFactory {

    public static Ractangle newRactangle(int width, int height) {
        return new Ractangle(width, height);
    }

    public static Ractangle newSquare(int side) {
        return new Ractangle(side, side);
    }


}
