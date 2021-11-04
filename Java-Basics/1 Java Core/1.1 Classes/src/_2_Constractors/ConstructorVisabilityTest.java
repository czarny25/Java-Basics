package _2_Constractors;

/*
 * Related topic -- Private Constructors
 * 
 * this class shows how to use private constructors and the reason for constructor visibility
 * for some constructors to better stay private
 */


public class ConstructorVisabilityTest {

	
	public static void main(String[] args) {

		ConstructorVisability cons = new ConstructorVisability(2, 3);

		System.out.println("Price for bags is: " + cons.getPriceForBags());
		System.out.println("Price for bags is: " + cons.getTotalPriceForBags());		
	}

}

class ConstructorVisability{

	private int freeBags;
	private int checkedBags;
	private double priceForCheckedBags;
	private double totalPriceForBags; 
	
	public ConstructorVisability(int bags) {		
		
		this(bags > 1 ? 25.0  : 50.0);
		
		this.freeBags = bags;		
		System.out.println("freebags is: " + freeBags);
	}
	
	public ConstructorVisability(int bags, int checkedBags) {
		
		this(bags);
		this.checkedBags = checkedBags;
		this.totalPriceForBags = checkedBags * priceForCheckedBags;
		System.out.println("checkedBags is: " + checkedBags);
	}
	
	
	private ConstructorVisability(double priceForCheckedBags){
		this.priceForCheckedBags = priceForCheckedBags;
		System.out.println("This is price per 1 bag");
	}
	
	public double getPriceForBags() {
		return priceForCheckedBags;
	}

	public double getTotalPriceForBags() {
		return totalPriceForBags;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}