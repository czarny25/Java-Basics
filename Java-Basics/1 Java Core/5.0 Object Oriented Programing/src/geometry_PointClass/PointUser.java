package geometry_PointClass;

import java.util.Scanner;

public class PointUser {

	Point p1;
	Scanner key;
	
	public static void main(String[] args) {
		
		PointUser pu1 = new PointUser();
		pu1.key = new Scanner(System.in);
		
		System.out.println("Please provide coordinates for your point:");
		
		int x = pu1.key.nextInt();		
		int y = pu1.key.nextInt();
		
		pu1.p1 = new Point(x, y);		
		System.out.println("Your point is: " + pu1.p1.toString());
			
						
			
		// here you check your distance
		String ans = "";
		System.out.println("Do you want to check distance from orgin?");				
		ans = pu1.key.next();	
		if(ans.equals("yes")){						
			System.out.println("The distance is: " + pu1.p1.distanceFromOrgin());			
		};
		
		System.out.println("Do you want to shif value?");				
		ans = pu1.key.next();	
		while(ans.equals("yes")){
			pu1.p1 = new Point();	
			System.out.println("Please provide coordinates for new point:");			
			x = pu1.key.nextInt();		
			y = pu1.key.nextInt();			
			pu1.p1.translate(x, y);
			System.out.println("The new value is istance is: " + pu1.p1.toString());			
		};
	}
	
	
	

}
