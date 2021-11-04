package MyCustomExceptions;

// created by Marcin 
public class MyOwnException2 extends Exception{
//    private final int numOfBoxes = 0;
        
    public MyOwnException2(double num) {
        System.out.print(num + "? This is impossible");
       
    }

}

