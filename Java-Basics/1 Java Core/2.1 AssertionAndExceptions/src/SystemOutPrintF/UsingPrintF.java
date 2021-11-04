package SystemOutPrintF;
/** @author Marcin
 *  This application is about 
 **/
public class UsingPrintF {
    public static void main(String []args){
    // print the numbers in the one column
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%3d ",i * j);
            }
        System.out.println();}
    //

  }
}
