package _2_Constractors;

/* created by Marcin 
 * This class present basic constructor and set and get methods
 */
public class _1_NewConstractor {
        
        private String car;
        private String type;
        private String color;
        
    public _1_NewConstractor(){
        
    }
        
    public void setCar(String n, String t, String c){
        car   = ((n.equals("Fiat") || n.equals("Warszawa")|| n.equals("Polonez")|| n.equals("Syrena")) ? n : "nie miales auta cieciu");
        type  = ((t.equals("Sallon")||t.equals("Cabrio")||t.equals("Kombi")|| t.equals("Sedan")) ? t : "nie miales auta cieciu");
        color = ((c.equals("Red")||c.equals("Black")||c.equals("White")||c.equals("Yellow")) ? c : "nie miales auta cieciu");
    }
    public String getAnswer(){
        return (car + " " + type + " " + color);
    }
    public void sayWhat(){
        System.out.printf("My first car was %s\n %s ", car,type,color);
    }

}

