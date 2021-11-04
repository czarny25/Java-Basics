package OverridingANDhidingMethods;

// created by Marcin 
public class Cannine extends Mammal{
    
    
      
    
    public Cannine(boolean Noise,int size, int weight, boolean live){
        super(Noise,size,weight,live);
    }
    @Override
    public void makeNoise(String noise){
        
        System.out.println(noise);
    }
    
    
    
}

