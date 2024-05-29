public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1.2f, 3.4f);
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle();
		System.out.println(r2);

		r1.setLength(7.8f);
		r1.setWidth(5.6f);

		System.out.println(r1);

		System.out.printf("Length is: %.2f%n", r1.getLength());
		System.out.printf("Width is: %.2f%n", r1.getWidth());

		System.out.printf("Area is: %.2f%n", r1.getArea());
		System.out.printf("Perimeter is: %.2f%n", r1.getPerimeter());

		// Rectangle r3 = new Rectangle();
		// System.out.println(r3);
		// r3.setLength(2);
		// System.out.println(r3);
	}

}