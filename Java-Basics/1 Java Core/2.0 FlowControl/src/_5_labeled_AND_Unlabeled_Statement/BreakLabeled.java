package _5_labeled_AND_Unlabeled_Statement;
/**
 * @author Marcin
 */
public class BreakLabeled {
            
	public static void main(String[] args) {

		        int[] arrayOfInts =   { 32, 87, 3, 589,  12, 1076, 2000, 8, 622, 127 };
		       
		        int searchfor = 12;
		
		        int i;
		        boolean foundIt = false;
		
		        huj:
		        for (i = 0; i < arrayOfInts.length; i++) {
		           
		        	// this is label - condition that will trigger break 
		        	if (arrayOfInts[i] == searchfor) {
		                foundIt = true;
		                break huj;
		            }
		        }
		        if (foundIt) {
		            System.out.println("Found " + searchfor + " at index " + i);
		        } else {
		            System.out.println(searchfor + " not in the array");
        }
    }
}


