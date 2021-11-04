package _2_Constractors;

// created by Marcin 
public class MultiConstractors {
    
        private String ala;
        private String mal;
        String s;
        String n;
        
//        public MultiConstractors(){
//            this(null,null);
//        }
//        public MultiConstractors(String s){
//            this(s,null);
//        }
        public MultiConstractors(String ala, String mal){
        	this.ala = ala;
            this.mal = mal;
        	setName(s,n);
        }
    
        public void setName(String ala, String mal){
            
        	setS(s);
            setN(n);
        }
        
        public void setS(String ala){
           
        	s = ((ala.equals("Fiat") || ala.equals("Warszawa")|| ala.equals("Polonez")|| ala.equals("Syrena")) ? ala : null);
        }
        
        
        public void setN(String mal){
           n = ((mal.equals("Sallon")||mal.equals("Cabrio")||mal.equals("Kombi")|| mal.equals("Sedan")) ? mal : null);
        }
    
    
        public String getS(){
            return s;
        }
        public String getN(){
            return n;
        }
        public String show(){
            return String.format("%02s%02s",getS(),getN());
        }
        
        
        public static void main(String args[]){

//            MultiConstractors m = new MultiConstractors();
//            MultiConstractors m1 = new MultiConstractors("jeij");
            MultiConstractors m2 = new MultiConstractors("Fiat","Sedan");
            m2.setN("Sedan");
            m2.setS("Fiat");
//            System.out.printf("%s\n",m.show());
//            System.out.printf("%s\n",m1.show());
            
            System.out.println(m2.show());
        }

}

