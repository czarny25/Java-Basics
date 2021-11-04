package Excercises;

import java.util.Scanner;

public class Rabbit {

	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter string");
		printLetters(key.next());
			
		}
	
	
	public static void printLetters(String text) {		
		
		System.out.print(text.charAt(0));
		for (int i = 1; i < text.length(); i++) {
		
			System.out.print("–" + text.charAt(i));
		}
		
		System.out.println(); // to end the line of output
	}
}
