package liskovExample;

public class Square extends Ractangle {

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(height);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }

}
