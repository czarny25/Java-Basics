package _2_declareMemberVariables;
/** 
 * Program to show how to create convariant methods
 * @author Marcin Ziejewski
 * email - ziejewski@gmail.com
 * Created: 27/06/2013
 * Last change 27/06/2013
 */
import java.util.*;
public class ConvariantReturnType {
	
	public String[] createAnArray(int size){
		
		Scanner key = new Scanner(System.in);
		String[]array = new String[size];
		
		for(int i = 0; i < size; i++){
			  
			System.out.println("Please provide your entry");
		      array[i] = key.next();}
		
		return array;
		
	}
	
//	this method declaration takes varargs argument 
//	which means that we dont have to know how many 
//	arguments to pass to method
	
	public void PutAllTogether(String ... args){
	
		System.out.println(Arrays.toString(args));
		
	}
		
	
	public static void main(String args[]){
		
		ConvariantReturnType cr = new ConvariantReturnType();
		
//		System.out.println(Arrays.toString(cr.createAnArray(3)));
		
		cr.PutAllTogether(cr.createAnArray(3));
	}
	
	
}
