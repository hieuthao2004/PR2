public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        c1.getRadius();
        c1.getColor();
        c1.getArea();
        c1.display();

        Circle c2 = new Circle(2.0, "red");
        c2.getRadius();
        c2.getColor();
        c2.getArea();
        c2.display();

        Circle c3 = new Circle(1.0, "red");
        c3.getRadius();
        c3.getColor();
        c3.getArea();
        c3.display();

        Circle c4 = new Circle();
        c4.display();
        c4.setRadius(5.0);
        c4.display();

    }
}
