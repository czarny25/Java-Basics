package wiredExceptions;

// created by Marcin 
public class Fruit {

    public Fruit(){
    
    System.out.println("Exception 1 ");    
    }
    private Fruit(String name) {
    System.out.println("Exception 2 ");
    }
    public Fruit(String name, int q) {
    this();
    new Fruit();
    new Fruit("fdsf");
    System.out.println("Exception 3 ");
    }
    

    public static void main(String[] args) {
        Fruit f1 = new Fruit("fs");
//        System.out.println("Exception 3 ");
        }
}

