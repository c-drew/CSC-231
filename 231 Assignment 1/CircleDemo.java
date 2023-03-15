
public class CircleDemo {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(4);
		Circle c2 = new Circle(5);
		Circle c3 = c2.copy();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		System.out.println(c1.equals(c3));
		System.out.println(c2.equals(c3));
	}

}
