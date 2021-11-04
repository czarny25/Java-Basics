package geometry_PointClass;
import java.util.List;
import java.util.Scanner;

/**
 * @author Marcin
 *
 *	This class will create list of points for a particular geometric figure.
 */


public class PointUser2 {

	List<Point>square;//
	
	public static void main(String[] args) {
		
		Point p1;
		Scanner key = new Scanner(System.in);
		
		System.out.println("Please provide coordinates for your point:");
		
		System.out.println("Starting point:");
		int x0 = key.nextInt();		
		int y0 = key.nextInt();
		
		System.out.println("Size of rectangle:");
		int xn = key.nextInt();	
		int yn = key.nextInt();
		
		// create four points
		// this is for x coordinate
		for(int x = x0; x < 10; x+=xn){
			
			// this is for y coordinate
			for(int y = y0; y < 6; y+=yn){
				
				System.out.println(x + " " + y);
				
			//Point p = new Point();
			}
		
		}

	}

}
