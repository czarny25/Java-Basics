package String;

public class SplitingStrings {
	public static void main(String args[]) throws Exception {
	    String s = "A.BB.CCC";

	    String[] words = s.split("\\.");
	    for (String str : words) {
	      System.out.println(str);
	    }
	  }
	}