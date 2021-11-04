package Excercises;

import java.util.Scanner;

/** * 
 * @author Marcin
 * 
 *  Write a method called zeroDigits that accepts an integer parameter and returns the number of digits in the number
	that have the value 0. For example, the call zeroDigits(5024036) should return 2, and zeroDigits(743) should 
	return 0. The call zeroDigits(0) should return 1. (We suggest you use a do/while loop in your solution.)

 */

public class FindDigitsZero {

	public static void main(String[] args) {
		
	Scanner key = new Scanner(System.in);
	System.out.println("Enter number");
	System.out.println("The number of zeros in this number is " + zeroDigits(key.nextInt()));
		
	}
	
	public static int zeroDigits(int number){
		
		int numOfzeros = 0;
		String convertion = "" + number; // first number is turned into string
		
		for(int i = 0; i < convertion.length(); i++){ // string is checked char by char to find 0 characters
			if(convertion.charAt(i) == '0')
				numOfzeros++; // each time zero is find this increase by one 
		}
		return numOfzeros;
		
	}

}
