package geometry_PointClass;

/**
 * this is simple program to demonstrate basic idea of encapsulation
 * @author Marcin
 *
 */

public class Point {

	private int x;
	private int y;
	
	// this is the way to block constructor from using in wrong way
	// right now it can be used for reset of coordinates
	public Point(){
		this(0, 0);
	}
	// this construct new point with given coordinates
	public Point(int x, int y){
		setLocation(x, y);
	}
	// sets points location
	public void setLocation(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// getters
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}

	// this method returns distance from point
	public double distanceFromOrgin(){
		return Math.sqrt(x * x + y * y);
	}
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	public void translate(int dx, int dy){
		setLocation(x + dx, y + dy);
	}
	// this method will calculate distance between two different points
	public double distance(Point p2){
		
		double distance = Math.sqrt(Math.pow((p2.getX() - x), 2) + Math.pow((p2.getY() - y), 2));
		
		return distance;
		
	}
	
	
}
