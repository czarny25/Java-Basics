package Parsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reagax3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		
			Pattern p = Pattern.compile(".£"); 	// the expression  tutaj szukamy pps ze spacja po 
			// trzeciej cyfrze 
			
			//Matcher m = p.matcher("abaaaba \n   fghdf hfdghdfh hdfhgdfh \n fasdfhasfj"); 	// the source
			
			Matcher n = p.matcher("152 3689R£ 1523689R    1523689R £  \n 1523689R");  // jest tylko jedna taka
			
			int counter1 = 0;
			int counter2 = 0;
			
			//while(m.find()) {
			//
			//System.out.println(p + " found in space " + m.start() + " ");
			//counter1++;
			//}
			//System.out.println("there was " + counter1 + " in total");
			
			
			while(n.find()) {
			
			System.out.println(p + " found in space " + n.start() + " ");
			counter2++;
			}
			System.out.println("there was " + counter2 + " in total");


	}

}
