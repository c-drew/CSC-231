
public class PasswordCheck {

	public boolean isValidLength(String s1) {
		
		final int PASSWORD_MINLENGTH = 7;
		
		if (s1.length() >= PASSWORD_MINLENGTH)
			return true;
		else
			return false;
	}
	
	public boolean isValidChars(String s2) {
		
		final int PASSWORD_MINLOWER = 1;
		final int PASSWORD_MINUPPER = 1;
		final int PASSWORD_MINDIGIT = 1;
		
		int numCount = 0;
		int lowerCount = 0;
		int upperCount = 0;
		
		for(int i = 0; i < s2.length(); i++) {
			
			char ch = s2.charAt(i);
			
			if(Character.isDigit(ch))
				numCount++;
			else if (Character.isLowerCase(ch))
				lowerCount++;
			else if (Character.isUpperCase(ch)) 
				upperCount++;
			else
				return false;	
		}
		
		return ((numCount >= PASSWORD_MINDIGIT) && (lowerCount >= PASSWORD_MINLOWER) && (upperCount >= PASSWORD_MINUPPER));
		
	}

}