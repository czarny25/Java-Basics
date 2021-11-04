package Excercises;

import java.util.Scanner;

public class _1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		showTwos(keyboard.nextInt());
	}
	
	public static void showTwos(int number){
		
		
		int result = number;
		String answer = "";
		
		if (number % 2 == 0 ){
			
				do{
					number = number / 2;
					answer += "2 * ";
					
				}while(number % 2 == 0 && number > 2);
					
			System.out.println (result + " = " + answer + number );
			
			}else{	
			System.out.println(number + " = " + number );
		
			}
	}

}
