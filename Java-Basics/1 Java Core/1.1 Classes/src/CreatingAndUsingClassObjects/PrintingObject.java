package CreatingAndUsingClassObjects;

/* created by Marcin 
 * Only String object are able to print or 
 * others that contain some literal sequences
 * Others print just its name
 */
public class PrintingObject {
        public static void main(String args[]){

            StringBuilder sb = new StringBuilder();
            
            sb.setLength(23);            
            System.out.println(sb.length());

            for(int i = 0;i < sb.length()-1;i++){
//            	sb.append("-");
            	
            }
//            
            String s = sb.toString();
            System.out.println("[" + s + "]");

        }

}

