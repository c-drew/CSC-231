import java.util.Scanner;
public class PasswordDemo {

	public static void main(String[] args) {
		
		
		System.out.println("This program validates new passwords. Here are the rules: \n\n"
				+ "* The password should be at least 7 characters long\n"
				+ "* The password should contain at least one uppercase letter\n"
				+ "* The password should contain at least one lowercase letter\n"
				+ "* The password should contain at least one digit\n\n");
		
		System.out.print("Enter your password here: ");
		
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		sc.close();
		PasswordCheck pc = new PasswordCheck();
		
		if (pc.isValidLength(password) && pc.isValidChars(password))
			System.out.println("\nthis IS a valid password! :)");
		else
			System.out.println("\nthis is NOT a valid password! :(");
		}
}