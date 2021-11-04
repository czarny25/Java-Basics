package _4_arrays;
import java.awt.Point;
import java.lang.reflect.Array;
import java.util.*;
// created by Marcin 
public class ArrayOfObjects {
        public static void main(String args[]){
          
            Point[]points = new Point[3];
            
            points[0] = new Point(2,3);
            points[1] = new Point(3,8);
            points[2] = new Point(5,6);
            
            System.out.println(Arrays.toString(points));
        }
}

