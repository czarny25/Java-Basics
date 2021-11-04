package tokenizing;

public class TokenizingWithStringSplit {
	public static void main(String[] args) {
		
		int counter = 0;
		String[] tokens = "$Dub$lin£ er,Mar£ $cin".split("[\\$\\£\\s\\,]");
		System.out.println("count " + tokens.length);
		for(String s : tokens){

			Character l;
			char u;
			
			for(int i = 0 ; i <= s.length()-1; i++){
				l = s.charAt(i) ;
				
				if(Character.isUpperCase(l) ){
					counter++;
					
					if(counter == 1)
						System.out.print(l);
					else if(counter > 1)
						System.out.print(" " + l);
				}else{
					System.out.print(l);}
					
			}	
			
		}
		System.out.println();
//		System.out.print(counter);
	}
}
