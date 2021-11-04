package Parsing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IfExecrcise {

	public static void main(String[] args) throws FileNotFoundException {
					
		File f = new File("if.txt");
		f.exists();
//		System.out.println("if" + f.exists());

		Scanner s = new Scanner(f);
		
		int counter1 = 0;
		int counter2 = 0;
		
		while(s.hasNext()){
			String m = s.next();
//			System.out.println("word is ------ " + m);	
			counter1++;
			
//			int num = m.charAt(counter1++);
			
//			Pattern p = Pattern.compile(f,"[If][if][\\s\\^w\\.]");
			Matcher n = p.matcher(m);
			
			while(n.find()) {		
				System.out.println(p + " found in space " + n.start() + " ");
				counter2++;
				}
		}
		System.out.println("there was " + counter1 + " words  in total");		
		System.out.println("there was " + counter2 + " in total");
	}
}
