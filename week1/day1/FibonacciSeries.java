package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int firstNum = 0;
		int secNum = 1;
		int sum;
		
		System.out.println(firstNum);
		System.out.println(secNum);
		
		
		for (int i = 1; i <= 11; i++) { //1 2 3 4 5 6 7 8 9 10 11
			sum = firstNum + secNum;  //1 2 3 5 8 13 21 34 55 89 144
			  
			System.out.println(sum); //1 2 3 5 8 13 21 34 55 89 144
			
			firstNum = secNum; //1 1 2 3 5 8 13 21 34 55 89
			secNum = sum; //1 2 3 5 8 13 21 34 55 89 144
						
		}
				
	}
}
