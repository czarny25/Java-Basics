package AccessModifiers;
/**
 * @author Marcin
 */

 public class accessModifierChangedInOverwriting{
	 public static void main (String args[]){
		 
		 levelI l1 = new levelI();
		 l1.met3();
		 
		 
	 }

}
class levelI {
    public void met1(){}
           void met2(){}
 protected void met3(){}
   private void met4(){}
}

class levelII extends accessModifierChangedInOverwriting{
        public void met1(){} // this method must be public becouse it was inherit as public 
                             // it is not possible to assign weaker access mogfier than the original
        
        public void met2(){} // this one may be public and default becouse you are allowed to 
                             // expand access but not contract  
        
        protected void met3(){} // this one may be public, protected and default becouse you are allowed to 
                             // expand access but not contract   
        public void met4(){}
}

class levelIII{
    public void met1(){} // it'll always be public 
    public void met2(){}
    public void met3(){}
    private void met4(){}
}

class levelVI{
    public void met1(){}
    public void met2(){}
    public void met3(){}
    private void met4(){}
}

class levelV{
    public void met1(){}
    public void met2(){}
    public void met3(){}
   private void met4(){}
}