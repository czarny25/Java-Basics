package AccessModifiers;
/**
 * This class proves that access modifiers and return type can be changed during overload
 * @author Marcin
 */
public class accesModifierChangeInOverloadMethod {
    
    // in overloading you can change an access modifiers as long as you want 
    // every single method is a new method
    
        public String met1(){
			return null;}
        void met1(int e){}
        private int met1(String er){
			return 0;}
        protected void met1(String er, int e){}
    
    
}
