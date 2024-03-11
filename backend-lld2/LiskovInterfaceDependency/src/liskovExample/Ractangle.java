package liskovExample;

public class Ractangle {

    int height;
    int width;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int calculateArea() {
        return this.height * this.width;
    }

}
