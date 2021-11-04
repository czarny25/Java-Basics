package geometry_PointClass;

import java.awt.*;
/**
 * 
 * @author Marcin
 *
 *	this class is made in purpose of testing methods of Point class
 */


public class PointSimple {

	public static void main(String[] args) {
		
		// Create two points
		Point p1 = new Point(0, 0);
		Point p2 = new Point(5, 5);
		
		System.out.println(p1.distance(p2));
		
		System.out.println(p1.toString());
	}

}
