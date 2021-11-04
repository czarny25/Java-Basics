package zoo;

// created by Marcin 
public class Dog extends Animal implements pet{
    
    @Override
    public void makeNoise(){
        System.out.println("wrr");
    }

    @Override
    public void beFriendly() {
        System.out.println("wuu wuuu");
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String takeFood(String food) {
        System.out.println(food);
        return "take " + food;
    }

}

