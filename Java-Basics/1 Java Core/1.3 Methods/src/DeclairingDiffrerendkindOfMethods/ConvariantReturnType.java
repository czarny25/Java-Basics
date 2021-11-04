package DeclairingDiffrerendkindOfMethods;
/** 
 * Program to show how to create convariant (varargs) methods
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
			array[i] = key.next();
		}
		
		return array;
		
	}
	public void PutAllTogether(String ... args){
	
		System.out.println(Arrays.toString(args));
		
	}
	
	
	
	
	public static void main(String args[]){
		
		ConvariantReturnType cr = new ConvariantReturnType();
//		System.out.println(Arrays.toString(cr.createAnArray(3)));
		
		cr.PutAllTogether(cr.createAnArray(3));
	}
	
	
	
}
