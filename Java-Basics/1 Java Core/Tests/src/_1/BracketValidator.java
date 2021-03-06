package _1;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class BracketValidator {

	
	static String input = 			
	"for ( var i = previousTagId); i < length; i++) { "
	+ "	var testTag = document.getElementById('tab' + tabId); "
	+ "	if (testTag != undefined) {  var temp = testTag; 	"
	+ "exercises.push(temp); 	testTag.parentNode.removeChild(testTag); "
	+ "  }	tabId++; }" 
	;
	
	
	
	public static Stack<Character> checkString(String input){
		
		// Map that stores key - value pairs of possibles brackets
		Map<Character, Character> openers_to_closers = new HashMap<Character, Character>();			
		openers_to_closers.put('(' , ')');
		openers_to_closers.put('{' , '}');
		openers_to_closers.put('[' , ']');

		// arrays for both
		ArrayList<Character> openers = new ArrayList<Character>();
		ArrayList<Character> closers = new ArrayList<Character>();
		
		openers.addAll(openers_to_closers.keySet());
		closers.addAll(openers_to_closers.values());
		
		//System.out.println(openers.toString());		
		//System.out.println(closers.toString());
		
		// this stack will keep all of them at order
		Stack<Character> openers_stack =  new Stack<Character>();
		
		// last processed char for next
		Character last_unclosed_opener;		
		Character last_openersCloser;
		
		for(int i = 0; i < input.length(); i++){
			
			char c = input.charAt(i);
			//System.out.println(c);
			
			
			if(openers.contains(c)){
				openers_stack.push(c);
				last_unclosed_opener = c;
				System.out.println(c);
			
			}else if (closers.contains(c)){
				
				if(!openers_stack.contains(c)){
					System.out.println("Error at " + i);
				
				}else{
	                last_unclosed_opener = openers_stack.pop();
	                System.out.println("last_unclosed_opener - " + last_unclosed_opener);
	                if(openers_to_closers.get(last_unclosed_opener) == c){
	                	
	                	
	                }
	                
				}
			}
			 //System.out.println("done");
		}
		
		
		return openers_stack;
				
	}
	
	
//		Set openers = frozenset(openers_to_closers.keySet());
//		closers = frozenset(openers_to_closers.values())
		
//		boolean b1 = false; 
//		boolean b2 = false; 
//		boolean b3 = false; 
//		
//		System.out.println("input has " + input.length() + " chars");
//		System.out.println();
		
//		
//			//System.out.print(input.charAt(i));
//			char c = input.charAt(i);
//			
//			if((c == '{') && (!b1)  ) {
//				b1 = true;
//				System.out.println("b1 is " + b1 + " at " + i);
//			}
////			if( (b1)  && ((c == ')') || (c == ']')) ){
////				System.out.println("Error at " + i);
////			
////			}			
//			if (c == '}'){
//				b1 = false;
//				System.out.println("b1 is " + b1 + " at " + i);
//			
//			}else{
//				
//			}
////			
////			}else if((c == '(') && (b1)){
////				System.out.println("Error at " + i);
////			}			
////			else if (c == ')'){
////				b1 = false;
////				System.out.println("b1 is " + b1 + " at " + i);
////			};
////			
//			
//			
//		}
		
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		if(){
//			
//		}
		
		
		//System.out.println(input);
		
	
	
	
	public static void main(String[] args) {

		System.out.println(checkString(input));

	}

}
