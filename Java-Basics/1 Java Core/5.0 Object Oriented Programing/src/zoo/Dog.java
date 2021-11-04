package zoo;

// created by Marcin 
public class Dog extends Animal implements pet{
    
    @Override
    public void makeNoise(){
        System.out.println("wrr");
    }

    public void beFriendly() {
        System.out.println("wuu wuuu");
    }

    
    public void play() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
    public String takeFood(String food) {
        System.out.println(food);
        return "take " + food;
    }

}

