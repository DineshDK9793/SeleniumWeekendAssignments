package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String textValue = "changeme";
		
		char[] charText = textValue.toCharArray();
		int len = charText.length;
		
		for(int i=0; i<=len-1;i++) {
			
			if(i%2==1) {
				char upperCase = Character.toUpperCase(charText[i]);		
				System.out.print(upperCase);
			}
			else {
				System.out.print(charText[i]);
			}
		}
	}
}
