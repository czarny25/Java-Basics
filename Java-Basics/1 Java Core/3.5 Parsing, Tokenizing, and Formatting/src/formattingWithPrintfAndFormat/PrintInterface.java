package formattingWithPrintfAndFormat;

import java.io.Console;
import java.util.Scanner;

import consoleClass.ConsoleClass;

public class PrintInterface {
	public static void main(String[]args){
		
//		  Scanner c = new Scanner(System.in);
		  
		  Console c = System.console();
		
		  String id = c.readLine("%s", "Enter UserId:"); 			//1
		  
		  System.out.println("userid is " + id); 					//2
		  
		  String pwd = c.readPassword("%s", "Enter Password :"); 	//3
		  
		  System.out.println("password is " + pwd); 				//4

	}
}
