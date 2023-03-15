
public class Words {
	
	public static String upperFirst(String s) {
		
		char ch = Character.toUpperCase(s.charAt(0));

		return ch + s.substring(1);
	}
	
}
