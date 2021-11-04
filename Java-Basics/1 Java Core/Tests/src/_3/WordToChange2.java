package _3;

public class WordToChange2 {

	static String wordToCheck = "adi";
	static char[] wordToCheckConverted = wordToCheck.toCharArray();	
	
	public static void main(String[] args) {

		
		
		for(int i = 0; i <	wordToCheck.length() - 1; i++){
			
			for(int j = 0; j < wordToCheckConverted.length-1; j++){
				
				char c1 = wordToCheckConverted[j];				
				char temp = wordToCheckConverted[j + 1];
				wordToCheckConverted[j + 1] = c1;
				wordToCheckConverted[j] = temp;
				
				System.out.println(c1 + " + " + temp + " + " + wordToCheckConverted[j] + " + " +  wordToCheckConverted[j + 1]);
				
				StringBuilder permutationToChange = new StringBuilder();
				
				for(int s = 0 + i ; s < wordToCheckConverted.length; s++){
					//System.out.println(wordToCheckConverted[s]);
					permutationToChange.append(wordToCheckConverted[s]);
				}				
				
				
				for(int s = 0  ; s < (wordToCheckConverted.length - (wordToCheckConverted.length - i)); s++){
					//System.out.println(wordToCheckConverted[s]);
					permutationToChange.append(wordToCheckConverted[s]);
				}
				System.out.println(permutationToChange);
				
//				permutation = permutationToChange.toString();
//				System.out.println(permutation);
				
//				if(isPalindrome(permutation)){
//					permutations.add(permutation);
//					//System.out.println("is pali");
//				}
				
//				permutation = null;
				
			}
						
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
