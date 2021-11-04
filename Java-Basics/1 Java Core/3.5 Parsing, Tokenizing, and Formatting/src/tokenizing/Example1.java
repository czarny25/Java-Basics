package tokenizing;
public class Example1 {
	
	String ans;
	
	// main method that will execute all
	public static void main(String[] args) {
		
		Example1 ex = new Example1();
		ex.DoTokens();		
	}
	// this class will provide all necessary data
	public void DoTokens(){
		
		String source = null;
		String regex = "\\$";
		
		System.out.println(token(source, regex));
		
	}
	// this class will process tokenization
	public String token(String source, String regex){
		
		String[] t = source.split(regex);
		
		int size = t.length; // here I check the size of the array
		
//			System.out.println(size);  // size is ok
		if(t != null ){			
			for(String s : t){	
				ans += " >"+s+"< ";
//				System.out.print(">"+s+"<");
				}
//			String answ = "The size of array is " + size + " tokens \nThe tokes are: " + ans;
			return "The size of array is " + size + " tokens \nThe tokes are: " + ans;
		
		}else{
//			(size == 0 )
			return "The source is empty";
		}			
	}
}
