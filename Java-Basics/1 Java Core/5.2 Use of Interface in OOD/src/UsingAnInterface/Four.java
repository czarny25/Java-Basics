package UsingAnInterface;
/**
 * @author Marcin
 */
public class Four implements Three{
        
	public void firstMethod() { 
         // code here 
        
	}        
	public void secondMethod() {
            // code here
        
	}        
	public void thirdMethod() {
            // code here
        
	} 
}
        
interface One {
           
	void firstMethod();
        
}        
interface Two {
            
	abstract void secondMethod();
        
}        
interface Three extends One, Two { // interface extends other interfaces 
            
	void thirdMethod();
        
}