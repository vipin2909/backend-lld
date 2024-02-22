package LiskovSubstitution;

public class Ractangle {
    protected int width, height;

    public Ractangle() {

    }

    public Ractangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public int getArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "Ractangle{" + "width="+width+", height="+height+"}";
    }

    public boolean isSqaure() {
        return width == height;
    }
}
