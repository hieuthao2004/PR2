public class Test {
    public static void main(String[] args) {
        Square s1 = new Square(6);
        System.out.println(s1.toString());
        System.out.println(s1.getArea());

        Rectangle r1 = new Rectangle(1, 2);
        System.out.println(r1.toString());
        System.out.println(r1.getArea());
        Rectangle r2 = new Rectangle(2, 2, Colors.White, true);
        System.out.println(r2);

    }
}
