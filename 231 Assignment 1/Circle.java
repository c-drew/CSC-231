
public class Circle {

	private int radius;
	
	public Circle() {
		radius = 0;
	}
	
	public Circle (int r) {
		radius = r;
	}
	
	public void setRadius(int r) {
		radius = r;
	}
	
	public int getRadius () {
		return radius;
	}
	
	public double getArea () {
		return Math.PI * (radius * radius);
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public String toString() {
		return "Radius: " + radius + "\nArea: " + getArea() + "\nCircumference: " + getCircumference() + "\n";
		
	}
	
	public boolean equals(Circle c) {
		boolean status;
		if (radius == c.radius)
			status = true;
		else
			status = false;
		return status;
	}
	
	public Circle copy() {
		Circle c = new Circle(radius);
		return c;
	}
	
}
