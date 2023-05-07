package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String strValue = "madam";
		String revValue = "";
		int len = strValue.length();
		
		for (int i=len-1;i>=0;i--) {
			
			char charValue = strValue.charAt(i);
			//System.out.println(charValue);
			
			revValue = revValue+charValue;
			
			//System.out.println(revValue);
		}
		
		if(strValue.equalsIgnoreCase(revValue)) {
			System.out.println("Entered Character is a Palindrome");
		}
		else {
			System.out.println("Entered Character is not a Palindrome");
		}
		
	}
}
