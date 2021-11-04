package HowToCall_Super_Constractor;

// created by Marcin 

//import howToCall_SUPER_Method.*;

public class SubI extends SuperClass{
    
    private int salary = 20000;    
    
    public SubI(){
    }
    
    public int scream(){       
        return super.scream(); 
//        return salary;
    }

}

