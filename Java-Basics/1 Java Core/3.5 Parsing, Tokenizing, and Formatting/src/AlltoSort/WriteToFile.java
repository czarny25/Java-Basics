package AlltoSort;
import java.io.*;
import java.util.*;

/** created by Marcin
 *  This program is about creating file and writing some data to it formated as 
 *  String.
 **/  
public class WriteToFile {
        public static void main(String args[]){

         try{   
            Formatter f = new Formatter("fredzik.txt");
            f.format("%s%s%s", "to ","jest ","fredzik\nNara");
            f.close();
         }catch(FileNotFoundException e){
             System.out.println("error");
         }
        }

}

