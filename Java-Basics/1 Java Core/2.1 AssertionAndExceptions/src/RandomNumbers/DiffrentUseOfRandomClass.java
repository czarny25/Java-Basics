package RandomNumbers;

// created by Marcin 

import java.util.Random;

public class DiffrentUseOfRandomClass {
        public static void main(String args[]){

            Random ran = new Random();
            int result = - 1;
            int number = 9;
            rand1(result,number);
           
               
//                nextInt(max)  // Random integer between 0 and (max – 1)
//                nextDouble()  // Random real number between 0.0 (inclusive) and 1.0 (exclusive)
//                nextBoolean() // Random logical value of true or false

        
        }
        public static void rand1(int result, int number){
                Random ran = new Random();                           
                while(result != number){
                    result =  ran.nextInt(10)+5;     // Random integer from 1 to 14
                    System.out.println(result);}        
        }
        
        public static void rand2(int result, int number){
                Random ran = new Random();                           
                while(result != number){
                    result =  ran.nextInt(10);     // Random integer betwen 0 and 10 (10 not included)
                    System.out.println(result);}        
        }


}

