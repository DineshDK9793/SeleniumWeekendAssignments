package week1.day2;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String strValue = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] split = strValue.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
			for (int j = i+1; j < split.length; j++) {
				
				if (split[i].equalsIgnoreCase(split[j])) {
					
					split[j] = "";
					
					count++;
					
				}
				
			}
		}
			if (count>0) {
				
				for (int k = 0; k < split.length; k++) {
					
					System.out.print(split[k]+" ");
					
				}
				
			}
		}
		}
