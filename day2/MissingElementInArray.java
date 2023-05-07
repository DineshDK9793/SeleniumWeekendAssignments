package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] arrVal = {1,2,3,4,7,6,8};
		Arrays.sort(arrVal);
		System.out.println(arrVal);
		for (int i = 0; i < arrVal.length; i++) {
			if(i!=arrVal[i-1]) {
				System.out.println(i);
				break;
			}
		}
	}
}
