package CreatingAndUsingClassObjects;

public class ThisInConstractor {
    
    private int hela;
    private int mia;    
    private int lola;
    
    public ThisInConstractor(){
      
        hela = 2;
        mia = 3;
        lola = 4;
    }
    public ThisInConstractor(int hela){
        this.hela = hela;
         mia = 3;
        lola = 4;
    }
    public ThisInConstractor(int hela,int mia){
        this.hela = hela;
        this.mia = mia;
        lola = 4;
    }
    public ThisInConstractor(int hela,int mia, int lola){
        this.hela = hela;
        this.mia = mia;
        this.lola = lola;
    }
    public void print(){
       System.out.print("" + hela + mia + lola);
    }
    
    public static void main(String args[]){
        
        ThisInConstractor u = new ThisInConstractor();
        u.print();
        
    }
    
}
