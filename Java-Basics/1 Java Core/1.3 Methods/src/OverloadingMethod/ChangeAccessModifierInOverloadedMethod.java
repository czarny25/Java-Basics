package OverloadingMethod;

// created by Marcin 
// this code shows that we can easy change access modifier of each next 
// overloaded method from the previous one 
// and also we can change return type in each next method
// 
public class ChangeAccessModifierInOverloadedMethod {
        public static void main(String args[]){
            
            met1();
         
        }
        public static String met1(){
            return "";
        }
        private static int met1(int w){ // more restricted
            return w;
        }
        static String[] met1(String e){ // less restricted
        	String[]mela = {e,e,e,e};
            return mela;
        }
        protected static void met1(char[]r){
            
        }   

}

