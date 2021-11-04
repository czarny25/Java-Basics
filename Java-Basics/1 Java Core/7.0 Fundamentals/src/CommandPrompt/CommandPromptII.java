package CommandPrompt;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/*
 *  This class is run in CommandPrompt
 *  
 *  First compile it: javac CommandPromptII.java
 *  
 *  Next run (remember about parameter)
 *  	
 *  		java CommandPromptII <file name>
 *  
 *  In the event of error " 'javac' is not recognized... you must set up the path 
 *  
 *  	C:\ YourFolder >set path=C:\Program Files\Java\jdk< your version >\bin;
		C:\ YourFolder >javac YourCode.java
 *  
 *  More info under this URL: http://stackoverflow.com/questions/7709041/
   						      javac-is-not-recognized-as-an-internal-or-external
   						      -command-operable-program-or
 *  
 */


public class CommandPromptII {

	public static void main(String[] args) {

		if(args.length == 0){
			showUsage();
			return;
		}
		
		
		String file = args[0];		
		if(!Files.exists(Paths.get(file))){
			System.out.println("there is no such file");
		}
		showFile(file);
		
	}

	private static void showFile(String filename){
		
		System.out.println();
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(filename))) {
			String line = null;
			while((line = reader.readLine()) != null){
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println(e.getCause().getMessage());
		}
		
	}
	
	private static void showUsage(){
		System.out.println();
		System.out.println("Please provide the filename to process on the command line");
	}
	
}
