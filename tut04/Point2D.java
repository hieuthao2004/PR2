public class Point2D {
    private double x = 0;
    private double y = 0;

    Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    

    double distance(double dx, double dy) {
        x += dx;
        y += dy;
        double dis = Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2);
        return dis;
    }

    double distance(Point2D p) {
        double dis = Math.sqrt((this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y)) ;
        return dis;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    void display() {
        System.out.println(distance(Point2D p));
    }
}
