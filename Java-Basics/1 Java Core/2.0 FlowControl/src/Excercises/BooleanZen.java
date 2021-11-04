package Excercises;

import java.util.Scanner;

public class BooleanZen {

	public static void main(String[] args) {
	
		Scanner key = new Scanner(System.in);
		System.out.println("Enter string");
		
		System.out.println("The condition is " + startEndSame(key.next()));
		
	}
	
	public static boolean startEndSame(String str) {
		
		boolean t = true ;
		boolean f = false ;
			
			// easy to choice conditon
			return ((str.charAt(0) == str.charAt(str.length() - 1)) ?  t : f);

	}
}
