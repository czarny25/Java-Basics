package OverridingANDhidingMethods;
// created by Marcin 
// this is superclass 
public class Animal {        
        private int size;
        private int weight;
        boolean live;
        boolean Noise;
 // Constractors
        // Default Constractor
        public Animal(){
        }
        // Constractor that initialize variables
        public Animal(boolean Noise,int size, int weight, boolean live){
           this.Noise = Noise; 
           this.size = size;
           this.weight = weight;
           this.live = live;
        }
 // Methods
        // set method for "Noise"       
        public void setNoise(boolean noise){            
            Noise = noise; 
        }
        // get method for "Noise"
        public boolean getNoise(){
            return Noise;
        }
        
        public void eat(){
            System.out.println();
        }
        public void makeNoise(String noise){
            if((Noise == true)&&(live == true))
                System.out.println(noise);            
        }
        public void alive(){
            if(live == true)
                System.out.println("I am still around");
            else
                System.out.println("I am long gone");
        }
        public void size(){
            if((size >= 23)&&(weight >= 100))
               System.out.println("I am a big animal"); 
            if((size <= 0)&&(weight <= 0))
               System.out.println("I dont have body"); 
        }
}

