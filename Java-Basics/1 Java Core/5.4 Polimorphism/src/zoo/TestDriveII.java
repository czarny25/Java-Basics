package zoo;

// created by Marcin 
public class TestDriveII {
        public static void main(String args[]){

            Object a = new Object();
            Dog d = new Dog();
            Cat c = new Cat();
//            Dog b = (Dog)a; 
//            b.makeNoise();
            c.makeNoise();
            System.out.println(d.takeFood("bone"));

        }

}

