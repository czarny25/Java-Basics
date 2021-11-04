package _4_GoogleNumbers;

import java.lang.reflect.Array;

public class GoogleNumbers {

	
	static int[] nums = {1,2,4,4};
	
	
	
	
	public static void main(String[] args) {

		System.out.println(checkForSum(nums, 8));
		
	}




	private static String checkForSum(int[] num, int sum) {
		
		StringBuilder ans = new StringBuilder();
		
		for(int i = 0; i < (num.length / 2); i++){
			System.out.println("" + num[i] + ", " + num[num.length - i - 1]);
			if ((num[i] + num[num.length - i - 1]) == 8){
				//System.out.println("" + num[i] + ", " + num[num.length - i - 1]);
				return "" + i + ", " + (num.length - i);
			}
			
		}	
		return "no sum";	
		
	}

}
