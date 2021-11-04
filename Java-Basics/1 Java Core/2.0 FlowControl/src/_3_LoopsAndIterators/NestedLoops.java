package _3_LoopsAndIterators;

// created by Marcin 
public class NestedLoops {
        public static void main(String args[]){

            
            int max = 5;
            int x = 1;
            int bridge = 4;
            
            while(x < bridge){
                int num = 1;
                while(num <= max){
                    int number = 1;
                    while (number <= max) {
                    System.out.print("Hi there ");
                    number++;       // it is important to put stop 
                    }
                System.out.print("(_)");
                num ++;
                }
            System.out.println();
            x ++;
            }   

        }

}

