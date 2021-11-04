package Nested;

class AnnonymusClassesFlavorOne {

	public static void main(String args[]){
		
		Food f = new Food();
		f.popIt();
	}	
	
	public void pop1() {
		System.out.println("popcorn");
	}
}

class Food {
	
	/**
	 * here we have shown creation of anonymous class of type
	 */
	
		AnnonymusClassesFlavorOne p = new AnnonymusClassesFlavorOne() {
			
			public void pop() {
				System.out.println("anonymous popcorn");
			}
			
			public void pop1() {
				System.out.println("anonymous popcorn nr1");
			}
		};
		
		public void popIt() {
//			p.pop(); 						// OK, Popcorn has a pop() method
			p.pop1(); 					// Not Legal! Popcorn does not have sizzle()
		}
	
}
