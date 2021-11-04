package AlltoSort;
import java.io.File;

// created by Marcin 
public class FillTheFile {
        public static void main(String args[]){

            File f = new File("ale kicha.txt");
            
            System.out.println(FillMe(f));

        }

        public static File FillMe(File data){
            System.out.println("we change it");
            return data;
        }
}

