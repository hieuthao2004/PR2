public class Rectangle extends Shape2D {
    private double length = 1.0;
    private double width = 1.0;

    Rectangle() {

    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    Rectangle(double length, double width, Colors color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;    
    }

    Rectangle(double length, double width, Colors color, boolean filled, Point2D position) {
        super(color, filled, position);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return (getLength() + getWidth()) * 2;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Rectangle[length=" + getLength()+", width=" + getWidth()+ ", color="+ getColor()+", is filled="+isFilled()+"]";
    }
}
