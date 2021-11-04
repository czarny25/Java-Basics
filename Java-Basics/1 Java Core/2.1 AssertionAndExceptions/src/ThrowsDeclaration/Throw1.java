    package ThrowsDeclaration;

// created by Marcin 

import java.awt.List;
import java.util.ArrayList;

public class Throw1 {
        public static void main(String args[])throws Exception{

            long t = 0;
            String []x = new String[100];
            x[0] = "sdf";
            String num = x[(int)t];// lost of precision
            System.out.println(x[0] +" "+ num);

            ArrayList myList = new ArrayList();
            System.out.println(myList.size());
            
           
        }

}

