package CommandPrompt;

public class CommandLineArgs {
	/**
	 * this class suppose to be launch from Command Prompt
	 * witch entrance:
	 * 					java CommandLineArgs x 1  // or x 1 2 3 4  - then it will print four arguments
	 * 
	 * it will print all list of arguments for that class
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0;
		for(String s : args)
		 System.out.println(x++ + " element = " + s);

	}

}
