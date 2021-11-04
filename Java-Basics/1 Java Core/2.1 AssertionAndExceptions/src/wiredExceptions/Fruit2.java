package wiredExceptions;
// created by Marcin 
public class Fruit2 {
}    
class Fruit3 {
    
    
    public void freda(){
        System.out.println("Freda ");
    }
    
}    
class Fruit4 {
    Fruit4(){
        System.out.println("Exception ");
    }
    static{
    int wala = 34;
    System.out.println("Exception 1 " + wala);
    }
}    
  
class Fruit5 {
        public static void main(String args[]){
            new Fruit4();
            


        }

}

