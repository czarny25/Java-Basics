package CallingMethods;

// created by Marcin 
// this code shows how to call method by Class name not by object name
public class StaticMethodCall {
        public static void main(String args[]){

            SampleClass s = new SampleClass();
            s.Metoda2();
            SampleClass.Metoda1();
        }
}
class SampleClass{
    public static void Metoda1(){
        System.out.println("sampleOne");
    }
    public void Metoda2(){
        System.out.println("sampleTwo");
    }
    
}
