package MyCustomExceptions;

// created by Marcin 
public class MyOwnException1 extends Exception{
        
    public MyOwnException1() {
        System.out.print("This number is minus ");
    }
    public MyOwnException1(double num) {
        System.out.print(num + " This number is a float ");
    }
}

