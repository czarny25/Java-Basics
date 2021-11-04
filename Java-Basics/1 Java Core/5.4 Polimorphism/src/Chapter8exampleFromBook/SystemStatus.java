package Chapter8exampleFromBook;

// created by Marcin 
public class SystemStatus implements Logable{

    private long createdTimeStamp;
    
    public SystemStatus(){
        createdTimeStamp = System.currentTimeMillis();
    }
    private int getStatus(){
        if(System.currentTimeMillis() - createdTimeStamp > 1000){
            return 1;
        }else{
            return -1;
        }
    }
    @Override
    public String getInitInfo() {
        return "System object created " + createdTimeStamp;
    }

    @Override
    public String getLogableEvent() {
        return String.valueOf("Status: " + getStatus());
    }
        

}

