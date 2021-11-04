package NumbersAndCurrencies;

import java.text.*;
import java.util.*;


public class DateFormats {

	public static void main(String[] args) {
		
		Date d1 = new Date(0L); // this date is from 40 years ago					
		Date d2 = new Date();   // this is from now
				
		System.out.println("1st date " + d1.toString());
		System.out.println("2st date " + d2.toString());
		System.out.println();
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT );		
		df = DateFormat.getDateInstance(DateFormat.LONG);
		df = DateFormat.getDateInstance(DateFormat.FULL);
		
		DateFormat dl = DateFormat.getDateInstance(DateFormat.SHORT );		
//		dl = DateFormat.getDateInstance(DateFormat.LONG);
//		dl = DateFormat.getDateInstance(DateFormat.FULL);
		
		
		
		// short version 
		String s = df.format(d1);
		System.out.println(s);
		
		// long version
		String l = dl.format(d2);
		System.out.println(d2);

		String m = dl.format(d2);
		System.out.println(d2);
		
		System.out.println();
	
		try{
			Date d3 =  df.parse(s);
			System.out.println("parsed " + d3.toString());
			
			Date d4 =  dl.parse(l);
			System.out.println("parsed " + d3.toString());
		
		}catch (ParseException pe) {
			System.out.println("parse exce");
		}
		
		
	
	}

}
