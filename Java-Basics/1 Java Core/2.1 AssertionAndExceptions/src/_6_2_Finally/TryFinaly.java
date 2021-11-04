package _6_2_Finally;

// created by Marcin 
public class TryFinaly {
        public static void main(String args[]){

            try{
                throw new ArithmeticException("from try is printed");
//                System.out.println("from try is printed");
            }finally{
                throw new ClassCastException("from finally is printed");
//                System.out.println("from finally is printed");
            }


        }

}

