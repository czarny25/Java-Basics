package Parsing;

import java.util.regex.*;

public class RegexSmall {

	public static void main(String [] args) {

		Pattern p = Pattern.compile("[H]"); 	// the expression

		Matcher m = p.matcher("abaaaba \n   fghdf hfdghdfh hdfhgdfh \n fasdfhasfj"); 	// the source
		Matcher n = p.matcher("345435  565476 857 67 8678 568 ");
		
		int counter1 = 0;
		int counter2 = 0;
		
		while(m.find()) {

			System.out.println(p + " found in space " + m.start() + " ");
			counter1++;
		}
		System.out.println("there was " + counter1 + " in total");
	
		while(n.find()) {

			System.out.println(p + " found in space " + n.start() + " ");
			counter2++;
		}
		System.out.println("there was " + counter2 + " in total");
	
	
	
	}
}