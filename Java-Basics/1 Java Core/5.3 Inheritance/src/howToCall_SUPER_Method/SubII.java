package howToCall_SUPER_Method;

// created by Marcin 
public class SubII extends SubI{
    
    private int salary = 30000;
    
    public SubII(){
    }
    
    public int scream(){        
        return super.scream();
//        return salary;
    }

}

