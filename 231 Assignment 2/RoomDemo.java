import java.util.Scanner;

public class RoomDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This is a program that will display the total cost of a carpet given three parameters; length, width, and price/sqft.\n");
		
		System.out.println("Enter the length of your room: ");
		double length1 = sc.nextDouble();
		System.out.println("Enter the width of your room: ");
		double width1 = sc.nextDouble();
		
		System.out.println("Now, enter the price of the carpet in square feet: ");
		double cost1 = sc.nextDouble();
		
		RoomDimension rd1 = new RoomDimension(length1, width1);
		RoomCarpet rc1 = new RoomCarpet(cost1);
		
		System.out.println("The total cost of the carpet will be: $" + rc1.getCarpetCost(rd1.getArea(), rc1.getCarpetCost()));
		
		sc.close();
	}

}
