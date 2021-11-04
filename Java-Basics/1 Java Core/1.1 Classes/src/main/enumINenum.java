package main;

// created by Marcin 
public class enumINenum {
    public enum State{ACTIVE, DELETED, INACTIVE}
    public enum Country {}
}

class Test {     
    public static void main(String args[]) {
        enumINenum.State state = enumINenum.State.DELETED;
        
        System.out.println(state);
    }
}
