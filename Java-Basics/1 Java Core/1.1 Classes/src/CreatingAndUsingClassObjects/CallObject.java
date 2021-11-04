package CreatingAndUsingClassObjects;

/** created by Marcin
 *  These are a simple class that present ways to create, call, initialize and use 
 *  class objects
 */ 
public class CallObject { 
    
    int num;
    
    // this is default constractor
    public CallObject(){
        
    }
    // this is constractor overloaded whit one parameter
    public CallObject(int num){
        this.num = num;
    }
    // method that prints something
    public void fila(){
        System.out.println("jestem fila");
    }
     // an overloaded version of above method this time whit parameter
     public void fila1(){
        System.out.println("jestem fila z numerkiem " + num);
    }
    
    // this is main method from where one or all constractors are called
    public static void main(String args[]){
              
        // default consterctor is called and variable of its type is created;
        CallObject co;
        // varible of type "CallObject" create new Object adn point to it;
        co = new CallObject();
        
        // another object from that class this time it holds an argument
        CallObject c = new CallObject(23);
            
      // now when I have two diffrent objects lets use them.
      
     // ie. call some method
//        co.fila1();
        
      // ie. call some method
//        c.fila1();
        
        
        
        }
    }


