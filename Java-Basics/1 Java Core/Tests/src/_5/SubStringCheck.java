package _5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubStringCheck {

	public static void main(String[] args) {

		isSubstring("watterbottle", "terbottlewat");
		
	}
	public static void isSubstring(String string1, String string2) {

		if(string1.length() != string2.length()){
			System.out.println("No substring");
		}
		else{
			
			char[] s1 = string1.toCharArray();
			Arrays.sort(s1);
			string1 = Arrays.toString(s1);
			
			
			char[] s2 = string2.toCharArray();
			Arrays.sort(s2);
			string2 = Arrays.toString(s2);
			
			System.out.println( string1);
			System.out.println( string2);
			
			if(string1.equals(string2)){
				System.out.println("true");
			}
			
			
			
		}
		
		
	}
	

}
