package CommandPrompt;

import java.util.Properties;

public class UsingSystemProperties {
	/**
	 * this class suppose to be launch from Command Prompt
	 * witch entrance:
	 * 					java -DmyProp=myValue MyClass x 1
	 * 
	 * it will print all properties of 
	 * @param args
	 */
	public static void main(String[] args) {
					
			Properties p = System.getProperties();
			p.setProperty("Heniek", "piatka");
			p.list(System.out);
	
	}
}