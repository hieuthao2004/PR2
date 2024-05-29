package Shape;

public class Square extends Rectangle {
    private double side = 1.0;

    Square() {

    }

    Square(double side) {
        this.side = side;
    }

    Square(double side, String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        this.side = side;
    } 

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String toString() {
        return "Rectangle";
    }
}
