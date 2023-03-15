
public class RoomDimension {

	private double length;
	private double width;
	
	public RoomDimension(double w1, double l1) {
		this.length = l1;
		this.width = w1;
	}
	
	public double getArea() {
		return length * width;
	}
	
	
}
