package _6_logicalOperators;

public class Not_Short_CircuitLogicalOperators {

	/**
	 	Also called bitwise operators
	 	■ & non-short-circuit AND
		■ | non-short-circuit OR
	 */
	public static void main(String[] args) {

		int z = 5;
		if(++z > 5 || ++z > 6) z++; // z = 7 after this code
		
		//versus:
		
		int y = 5;
		if(++z > 5 | ++z > 6) z++; // z = 8 after this code
		

	}

}
