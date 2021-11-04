package Excercises;
import java.util.Scanner;

public class SentinelLoop {
	
	Scanner key = new Scanner(System.in);	

	public static void main(String[] args) {
		
		SentinelLoop sl = new SentinelLoop();		
		System.out.print("Type a number (or –1 to stop): ");		
		sl.printNumber(sl.key.nextInt());

	}	
	public void printNumber(int setinelNum){		
		
		int min = 0;
		int max = 0;
		
		if(setinelNum != -1){
			while(setinelNum != -1){			
				System.out.print("Type a number (or –1 to stop): ");
				setinelNum = key.nextInt();
							
				
				if(max < setinelNum)
					max = setinelNum;
				else
					min = setinelNum;
					
			}	
			
			System.out.println("Minimum was" + max);	
			System.out.println("Maximum was" + min);
		}
	}

}
