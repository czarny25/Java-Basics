package _6_RandomNumbers;

// created by Marcin
// build in java class that let you to get quick random num if you need whitout
// importing anything 
public class MathRandom {
        public static void main(String args[]){

            double num1 = (Math.random()); 
            /**
             *  Math class returns only the value between 0.0 and 1.0
             *  but it nevers has the value 1
             */

            double num = (Math.random() * 100 + 1); 
            
            /**
             * If we want to get value between ie. 0 - 100 we have to 
             * multiply it by 100 and add 1 and use Printf to display it 
             */
            
            System.out.printf("%f \n%.2f \n",num1,num);

        }

}

