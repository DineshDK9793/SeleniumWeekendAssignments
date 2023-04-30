package week1.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		int num = 13;
		int count = 0;
		
		for (int i=1;i<=num;i++) {  
			
			if(num%i == 0) {    			
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("Entered number is Prime Number");
		}
		else {
			System.out.println("Entered Number is Not a Prime Number");
		}
	}
}
