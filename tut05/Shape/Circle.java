package Shape;

public class Circle extends Shape {
    private double radius = 1.0;

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI; 
    }

    public double getPerimeter() {
        return (2 * getRadius() * Math.PI);
    }

    public String toString() {
        return "Circle";
    }
}
