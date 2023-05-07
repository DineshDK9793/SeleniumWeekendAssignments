package week1.day2;

public class ReverseEvenWords {
	
	public static void main(String[] args) {
		
		String test = "I am a software tester";
		String[] splitWords = test.split(" ");
		
		for (int i = 0; i < splitWords.length; i++) {
			
			if(i%2==0) {
				char[] chars = splitWords[i].toCharArray();
				String revString = "";
				for (int j =chars.length-1; j>=0; j--) {
					revString = revString+chars[j];
				}
				System.out.println(revString);
			}
			else {
				System.out.println(splitWords[i]);
			}
		}
	}

}
