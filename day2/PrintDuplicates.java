package week1.day2;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		int[] arrVal = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len = arrVal.length;
		//System.out.println(len);

		int count;
		
		for (int i = 0; i < arrVal.length-1; i++) {
			count = 0;
			for (int j = i+1; j < arrVal.length-1; j++) {
				if(arrVal[i]==arrVal[j]) {
					count++;
				}
			}
			if (count>0) {
				System.out.println(arrVal[i]);
			}
		}
		
	}
}
