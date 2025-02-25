public abstract class Shape2D implements Shape2DCalculation {
    private Colors color = Colors.White;
    private boolean filled = false;
    private Point2D position = new Point2D();

    Shape2D() {

    }

    Shape2D(Point2D position) {
        this.position = position;
    }

    Shape2D(Colors color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    Shape2D(Colors color, boolean filled, Point2D position) {
        this.color = color;
        this.filled = filled;
        this.position = position;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Point2D getPosition() {
        return position;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public String toString() {
        return "";
    }
}
