public class Point2D {
    private double x = 0;
    private double y = 0;

    Point2D() {

    }

    Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }

    public double getDistance(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2));
        return distance;
    }

    public double getDistance(Point2D point) {
        return getDistance(point.getX(), point.getY());
    }

    public String toString() {
        return "Point2D[x="+ getX() +", y="+ getY() +"]";
    }
    
}