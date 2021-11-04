package Parsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SerchingWithMetacharacter {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[a-c2-5E-R]"); 	// the expression

		Matcher m = p.matcher("abaaaba \n   fghdf hfdghdfh hdfhgdfh \n fasdfhasfj"); 	// the source
		Matcher n = p.matcher("1523689R");
		
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
