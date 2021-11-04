package _6_RandomNumbers;
import java.util.Random;

// created by Marcin 
public class Random1 {
        public static void main(String args[]){

            Random rand1 = new Random();
           
                Rando3(rand1);
//            System.out.println(rand1.getClass());
        }     
            public static int Rando1(Random rand1){
            int a = 0;
                for(int i = 0; i < 30;i++){
                    a = rand1.nextInt(10) + 5; // Print random number from 5 to 14
                    System.out.println(a);
                }
            return a;
            }   
            public static int Rando2(Random rand1){
            int a = 0;
                for(int i = 0; i < 30;i++){
                    a = rand1.nextInt(10) * 5; // multiply random number from 0 to 9 by 5
                    System.out.println(a);
                }
            return a;
            }  
            public static int Rando3(Random rand1){
            int a = 0;
                for(int i = 0; i < 30;i++){
                    a = rand1.nextInt(10) - 5; // Print random number from -5 to 4
                    System.out.println(a);
                }
            return a;
           
            
            
            }
            
        

}

