package _2_relationalOperators;

public class Example1 {

	/**
	 * Java has four relational operators that can be used to compare any combination of
	   integers, floating-point numbers, or characters:
		■ >  greater than
		■ >= greater than or equal to
		■ <  less than
		■ <= less than or equal to
	 */
	public static void main(String[] args) {
		
		String animal = "unknown";
		int weight = 700;
		char sex = 'm';
		double colorWaveLength = 1.630;
		
			if (weight >= 500) { 
				animal = "elephant"; 
				}
			
			if (colorWaveLength > 1.621) { 
				animal = "gray " + animal; }
			
			if (sex <= 'f') { 
				animal = "female " + animal; 
			}
		
		System.out.println("The animal is a " + animal);
		}

}
