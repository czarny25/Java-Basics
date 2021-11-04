package _2_Constractors;

/*
 * This class shows how constructors use word super and this and how
 * variable is changed by inheritance
 */

public class Good_example_of_DefaultConstractorTest{
	
	public static void main(String args[]){	

	
	DefaultConstractor df = new DefaultConstractor(7); 
	df.print();
	
	DefaultConstractorSubclass dfs = new DefaultConstractorSubclass(2, 9);
	dfs.print();
	
	DefaultConstractorSubclassSubs dfss = new DefaultConstractorSubclassSubs(6, 5, 4);
	dfss.print();
	
	}
}

class DefaultConstractor {
	
	int a;
	
	public DefaultConstractor(int a) {			
		this.a = a - 3;
	}
	
	public void print(){
		System.out.println(a);
	}
}
	
class DefaultConstractorSubclass extends DefaultConstractor{
		
	int b = 0;
		
	public DefaultConstractorSubclass(int a, int b){
			super(a);
			this.b = b;			
	}
		
		public void print(){
			System.out.println(a + " " + b);
		}
}
	
class DefaultConstractorSubclassSubs extends DefaultConstractorSubclass{
		
	int c = 0;
		
	public DefaultConstractorSubclassSubs(int a, int b,int c){
			super(a, b);
			this.b = b;			
	}		
		
	public void print(){
		System.out.println(a + " " + b + " " + c);		
	}	
}
	
	
	
	
	

