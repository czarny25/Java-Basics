package ShoppingAplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class GroceryList implements ListInterFace {
		
		private String name;
		private String dateCreated;
		private ArrayList< ListItem> list;
		Scanner keyboard;
		
		public GroceryList(String name){
			
				// set name for list
				this.name = name;
				// this will create data object with current data
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");				 
				Date date = new Date();				   
				dateCreated = dateFormat.format(date);
				list = new ArrayList<ListItem>(10);
				   
				   System.out.println("The list named: " + getName() +  " created at "+ getDateCreated());
				   
		}
		/**
		 * this is block of methods that will provide functional choices for user
		 */
		
		public String getName() {
			return name;
		}		
		public String getDateCreated() {
			return dateCreated;
		}
		public void addProduct() {
			// Now create object of ListItem and add it to the list
			System.out.println("Please provide name, price and quantity for  your product");
			String productName = keyboard.next();
			double price = keyboard.nextDouble() ; 
			int quantity  = keyboard.nextInt() ;
			ListItem li = new ListItem(productName, price, quantity);
			
			list.add(li);
			
			
			System.out.println("Your product has been added");
			
		}
		
		// this method will display all items in the window
		public void showList() {
			
			
		}
		
		
		
		public void saveList() {
			// TODO Auto-generated method stub
			
		}
		public void deleteList() {
			// TODO Auto-generated method stub
			
		}
		public void copyList() {
			// TODO Auto-generated method stub
			
		}
		public double getTotalCost() {
			// TODO Auto-generated method stub
			return 0;
		}
		

		
		
}
