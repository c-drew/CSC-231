
public class RoomCarpet {

	private double RoomDimension;
	private double carpetCost;
	
	public RoomCarpet(double cost) {
		this.carpetCost = cost;
	}
	
	public double getCarpetCost() {
		return carpetCost;
	}
	
	public double getCarpetCost(double RoomDimension, double carpetCost) {
		return RoomDimension * carpetCost;
	}
	
}
