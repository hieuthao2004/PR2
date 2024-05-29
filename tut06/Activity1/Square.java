public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    Square(double side, Colors color, boolean filled) {
        super(side, side, color, filled);
    }

    Square(double side, Colors color, boolean filled, Point2D position) {
        super(side, side, color, filled, position);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        // TODO Auto-generated method stub
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        // TODO Auto-generated method stub
        super.setWidth(side);
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Math.pow(getSide(), 2);
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return getSide()*4;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Square[side="+ getLength()+ "]";
    }
}
