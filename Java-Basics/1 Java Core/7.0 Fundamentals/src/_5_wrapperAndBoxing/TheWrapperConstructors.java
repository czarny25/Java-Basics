package _5_wrapperAndBoxing;

/**
 * @param args
 */

public class TheWrapperConstructors {

	public static void main(String[] args) {
		
		int num = 23;
		char let = 'g';
		String word = "23";		
		
		Integer i1 = new Integer(num);
		Integer i2 = new Integer(let);
		Integer i3 = new Integer(word);

		// converts 101011 to 43 and assigns the value
		// 43 to the Integer object i2
		
		Integer i4 = Integer.valueOf("101011", 2);
		System.out.println(i4);
		
		Boolean b = new Boolean("false");
		 
		//or
		
		Float f1 = new Float(3.14f);
		Float f2 = new Float("3.14f");
		
		takeInteger(num);
//		takeInteger(word);
//		takeInteger(let);
	}
	
	static int takeInteger(Integer i){
		
		int num = i;		
		return num;
		
	}	
}
