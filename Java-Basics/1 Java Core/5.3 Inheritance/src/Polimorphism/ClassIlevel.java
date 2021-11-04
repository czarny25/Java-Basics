package Polimorphism;

// created by Marcin 
public class ClassIlevel extends ClassTop{
        
    String profession = "nurek";
    double income = 23.50;
    boolean holiday = false;
    
    public ClassIlevel(){
        super();
//        present();
    }
    
    public ClassIlevel(boolean holiday, String name, int age, String sex){
        super(name,age,sex);
        this.holiday = holiday;

    }
    
    @Override
    public void present(){
        System.out.println("I work as a " + profession + " and I get " + income + " per week.");
    }
    
    public void extra(){
        if(holiday)
            System.out.println("I have holiday this year");
        else
            System.out.println("I don't have holiday this year");
    }
    
}

