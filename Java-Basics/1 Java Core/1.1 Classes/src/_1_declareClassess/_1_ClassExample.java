package _1_declareClassess;
/** 
 *  The introduction to object-oriented concepts.Here we have program that simulate bicycle object.
 *  We have one super class "Bicycle" and some subclasses:
 *  - racing bikes
 *  - mountain bikes
 *  - and tandem bikes
 *  
 *  Here is sample code for a possible implementation of a Bicycle class, to give you an overview of a class declaration.
 *  
 **/



/*
 *  this class is so called user class and is used for crating and instantiating other classes
 */

public class _1_ClassExample {
	// user class must have main method
    public static void main(String []args){

    	MountainBike mb = new MountainBike(78, 45, 1, 1);
  }
}

/*
 * this is super class bicycle that represent abstract object of bicycle
 */

class Bicycle {
    
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
}    
/* 
 *  this is sub class mountain bike that is blueprint for 
 *  mountain bike object
 *  
 */

class MountainBike extends Bicycle {
    
    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   

}
    