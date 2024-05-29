public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        System.out.println(p1.toString());
        MovablePoint p2 = new MovablePoint(1, 2, 1, 1);
        p2.move();
        String test2 = p2.toString();
        System.out.println(test2);
    }
}
