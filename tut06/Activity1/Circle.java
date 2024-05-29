public class Circle extends Shape2D {
    private double radius = 1.0;

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, Colors color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    Circle(double radius, Colors color, boolean filled, Point2D position) {
        super(color, filled, position);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double per = getRadius()*2* Math.PI;
        return per;
    }

    @Override
    public double getArea() {
        double area = Math.pow(getRadius(), 2) * Math.PI;
        return area;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Circle["+ getRadius() +"]";
    }
}
