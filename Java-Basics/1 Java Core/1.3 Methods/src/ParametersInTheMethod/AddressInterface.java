package ParametersInTheMethod;

import java.util.Scanner;

import DeclairingDiffrerendkindOfMethods.ConvariantReturnType;

public class AddressInterface {

	Scanner key = new Scanner(System.in);
	static String address = "";
	static int sizeOfArray;
	
	public void Address(){
		for(int i = 0; i < sizeOfArray; i++){
			System.out.println("Please provide your entry");
			String word = key.next();

			address =  address + "" + word + ", ";
			System.out.println("Your entry was " + word);
		}
//		
//		
	}
	public  String GetAddress(){
		return address;
	}
	
	public static void main (String args[]){
		
		Scanner key = new Scanner(System.in);
		AddressInterface ct = new AddressInterface();
		System.out.println("How big your array has to be? ");
		sizeOfArray = key.nextInt();	
		for(int i = 0; i < sizeOfArray; i++){
			ct.Address();
		}
		
		System.out.println("Your address is " + ct.GetAddress());
		
		
	}
	
	
	
}
