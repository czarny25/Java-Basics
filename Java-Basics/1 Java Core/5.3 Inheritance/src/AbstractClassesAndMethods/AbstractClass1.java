package AbstractClassesAndMethods;
/** @author Marcin
 *  This application is about 
 **/
public abstract class AbstractClass1 {
    
    int num = 34;    
    static String word = "dupa"; 
    
    public AbstractClass1(){        
    }
    abstract String setNum(String word);
    abstract String setWord(String word);
}
class helaNieAbstract extends AbstractClass1{
    
    @Override
    String setWord(String word) { // this is method from abstract classes
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    String setNum(String word) { //if class extends abstract class it must implemment all
             return word;        // its abstract methods
    }           
    public static void main(String []args){
        AbstractClass1 ab = new helaNieAbstract();        
        System.out.println("jestem abstract " + ab.setNum("dupa"));
   }

    
    
}