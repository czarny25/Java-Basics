package ShoppingAplication;

import java.util.Scanner;

public class ListCreator {

	GroceryList list;
	Scanner keyboard;
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Please provide name for  your list");
		
		ListCreator l = new ListCreator();
		
		l.keyboard = new Scanner(System.in);
		
		String name = l.keyboard.next();
		
		l.list  = new GroceryList(name);
		
		
	}

}
