package _3;

public class ReplaceChars {

	public static void main(String[] args) {

		replaceIt("Mr John Smith dfg dfgdfg");

	
	}

	static int whiteSpaceCounter;
	
	private static void replaceIt(String string) {

//		for(int i = 0; i < string.length(); i++){
//			if(string.charAt(i) == ' '){
//				whiteSpaceCounter++;
//			}
//			
//		}
//		
//		whiteSpaceCounter = whiteSpaceCounter + (whiteSpaceCounter * 2);
//		
//		System.out.println(whiteSpaceCounter);
		
		StringBuilder newString = new StringBuilder();
		
		for(int i = 0; i < string.length(); i++){
			
			if(string.charAt(i) == ' '){
				newString.append("%20");
				
			}else{
				newString.append(string.charAt(i));
			}
			
		}
		System.out.println(newString);
	}
	
	
	
	
	
}
