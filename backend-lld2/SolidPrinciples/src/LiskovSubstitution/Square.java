package LiskovSubstitution;

public class Square extends Ractangle {

    int size;

    public Square() {

    }

    @Override
    public void setWidth(int width) {
        super.setWidth((width));
        super.setHeight(height);
    }

    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }

    public Square(int size) {
        width = height = size;
    }
}
