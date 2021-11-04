package _6_RandomNumbers;

import java.util.Random;

//	Write code that generates a random integer between
//  0 and 10 inclusive.


public class RandomOdd {

	public static void main(String[] args) {
		
		// first num generated
		int num = new Random().nextInt(50) + 50;
		
		// this while makes sure that odd num will be generated
		while(num % 2 == 0){
			num = new Random().nextInt(50) + 50;
		}
		// num printed
		System.out.println(num);
		
	}	
	

}
