package OverridingANDhidingMethods;

// created by Marcin 
public class Mammal extends Animal{
       

        public Mammal(boolean Noise,int size, int weight, boolean live){
            super(Noise,size,weight,live);
        }
        @Override
    public void makeNoise(String noise){
        
        System.out.println(noise);
    }
        
}

