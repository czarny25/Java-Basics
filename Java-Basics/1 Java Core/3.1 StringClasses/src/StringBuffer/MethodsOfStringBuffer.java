package StringBuffer;

public class MethodsOfStringBuffer {

//	public synchronized StringBuffer append(String c){
//		return s;
//		
//	}
//	public StringBuffer delete(int start, int end){
//		return s;		
//	}
	
	public static void main ( String args[]){
		
		String se = " jest glupia";
		StringBuffer s = new StringBuffer("freda ");
		
		System.out.println(s.append(45435));
		System.out.println(s);
		
		s.insert(23, se); // try this when you open it next time
		
		s.reverse(); // try this when you open it next time
		
		s.toString(); // try this when you open it next time
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
