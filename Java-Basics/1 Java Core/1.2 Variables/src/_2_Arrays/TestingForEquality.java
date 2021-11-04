package _2_Arrays;

import java.util.Arrays;

/**
 * @author Marcin
 */
public class TestingForEquality {
        public static void main(String args[]){

            int[]IntNum1 = new int[3];
            int[]IntNum2 = new int[3];
            
            int[]IntNum3 = {1,5,3,4};
            int[]IntNum4 = {1,2,3,5};
            
//            System.out.println(AreWeEqual(IntNum3,IntNum4));
            System.out.println(EqualContent(IntNum3,IntNum4));
        } 
        public static boolean AreWeEqual(int[]IntNum1,int[]IntNum2){    
            if(Arrays.equals(IntNum1,IntNum2)){                            // API class Arrays contains special method 
               System.out.println("We are equal");                         // for testing equality of arrays
                return  true;}                                             // this is very fast and simple way but if  
            else{                                                          // you want to check every elaments of the 
               System.out.println("We are not equal");                     // array try next method example
                return  false;}       
        }
        public static boolean EqualSize(int[]IntNum1,int[]IntNum2){
            if(IntNum1.length == IntNum2.length){                           // this method test size of arrays 
                System.out.println("We are equal in size");                 
                return  true;}                                              
            else{                                                                
                System.out.println("We are not equal in size");             
                return  false;} 
        }
        public static String EqualContent(int[]IntNum1,int[]IntNum2){
            boolean bool = false;
            int counterpos = 0;
            int counterneg = 0;
            String result = "";
            for(int n = 0;n < IntNum1.length;n++){
                
                if(IntNum1[n] == IntNum2[n]){                           // this method test contens of arrays 
                    System.out.println("We are equal values");          // but it test values along with their index       
                    bool = true;                                        // "for exampel if both arrays contain 5 but 
                    counterpos++;}                                      // both have it on diffrent index place this
                else{                                                   // method recognize them as diffrent value"             
                    System.out.println("We are not equal values");             
                    bool = false;
                    counterneg++;}
            }
            result = String.format("There was %d the same values and %d diffrent values in both arrays",counterpos,counterneg);
            return result;    
        }
        public static String CheckEachValueAgainstEachOther(){
            String result = "";
            
            return result;
        }
}
