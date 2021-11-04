package systemProperty;

import java.util.*;
public class GetProperty {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		GetPropert g = new GetPropert(); 
			
			Properties p = System.getProperties();
			p.setProperty("Heniek", "piatka");
//			p.list(System.out);
//			}
//		}
		
		String property = p.getProperty("Heniek");
		
		System.out.println(Arrays.toString(p.keys()));
		;
	}

}

