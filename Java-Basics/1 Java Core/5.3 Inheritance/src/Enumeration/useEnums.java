package Enumeration;


//created by Marcin 

import java.util.Arrays;

public class useEnums {
     public static void main(String args[]){

         Temperatrue[] temp = Temperatrue.values();
    
         System.out.println(Arrays.toString(temp));
         Temperatrue te =  Temperatrue.FARENTHITE; // You dont use "new" keywoard when create enum object
         System.out.println(te);
         
        
       
     byte c = 2;
     byte a = 4;
     byte v =  (byte)(a + c);
     System.out.println(v);
     }
 }