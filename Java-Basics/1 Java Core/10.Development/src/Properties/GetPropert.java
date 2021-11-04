package Properties;
import java.util.*;
public class GetPropert {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		GetPropert g = new GetPropert(); 
			
			Properties p = System.getProperties();
			p.setProperty("Heniek", "piatka");
			p.list(System.out);
//			}
//		}
		
		String property = p.getProperty("Heniek");

	}

}
