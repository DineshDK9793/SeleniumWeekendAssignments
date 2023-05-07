package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		
		String textValue = "Tes12Le79af65";
		int sum = 0;
		
		String replaceAlphabets = textValue.replaceAll("\\D", "");
		char[] chValue = replaceAlphabets.toCharArray();
		
		//System.out.print(replaceAlphabets);
		
		for (int i = 0; i < chValue.length; i++) {

			int convertNumValue = Character.getNumericValue(chValue[i]);
			sum = sum+convertNumValue;		
		}
		System.out.println(sum);
	}
}
