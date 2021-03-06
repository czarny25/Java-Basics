package _5;

public class CountLetters {

	public static void main(String[] args) {

		countLettersApperance("abbbbbbbbbbbbbbcdefghi");

	
	}

	
	private static void countLettersApperance(String string) {
		
		
		StringBuilder shrinkedString = new StringBuilder();
		int counter = 0;
		
		shrinkedString.append(string.charAt(0));
		counter++;
		
		for(int i = 1; i < string.length(); i++){
			if(string.charAt(i) == string.charAt(i - 1)){
				counter++;
			}else{
				shrinkedString.append(counter);
				shrinkedString.append(string.charAt(i));
				counter = 1;
			}
		}
		shrinkedString.append(counter);
		
		String compressed = shrinkedString.toString();
		
		if(string.length() < compressed.length()){
			System.out.println(string + "   " + string.length() + "   " + compressed.length()) ;
		}else{		
			System.out.println(compressed + "   " + string.length() + "   " + compressed.length()) ;
		}
	};
}
