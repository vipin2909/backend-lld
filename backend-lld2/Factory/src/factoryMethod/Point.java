package factoryMethod;

enum CoordinateSystem {
    CARTESIAN,
    POLAR
}
public class Point {
    private double x, y;

    // static factory methods are mainly used to give descriptive function names in case of same
    // type of constructor arguments

    /***
     *
     * @param x is x if cartesian or rho if polar
     * @param y is y if cartesian or theta if polar
     * @param cs enum type for cartesian or polar
     */
//    public Point(double x, double y, CoordinateSystem cs) {
//        switch(cs) {
//            case CARTESIAN:
//                this.x = x;
//                this.y = y;
//                break;
//            case POLAR:
//                this.x = x * Math.cos(y);
//                this.y = x * Math.sin(y);
//                break;
//        }
//
//    }


    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public static Point newCartesianPoint(double x, double y) {
        return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta) {
        return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
    }


    @Override
    public String toString() {
        return "{x="+this.x+", y="+this.y+"}";
    }




}
