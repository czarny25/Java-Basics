package String;

public class Substring {

	public static void main(String args[]) {
	    String str = "this is a test";
	    System.out.println(removeCharAt(str, 3));
	  }

	  public static String removeCharAt(String s, int pos) {
		  
		  s = s.substring(0, pos) + s.substring(pos + 1);
		  
	    return s;
	  }
	
}
