package zoo;

// created by Marcin 

import java.util.ArrayList;
import java.util.Scanner;

class TestDriveI{
        public static void main(String args[]){
        
            MyAnimalsList list = new MyAnimalsList();
            Dog wilczur = new Dog();
            Dog doberman = new Dog();
            Cat c = new Cat();
            
            
            Object y = new Cat();
            Object f = new Scanner(System.in);
           
            list.add(c);
            list.add(wilczur);
            list.add(c);
            list.add(doberman);
            list.add(c);
    // method that will prints all object added 
            list.print();
   
            ArrayList<Dog> myDogList = new ArrayList<Dog>();
            myDogList.add(wilczur);
            myDogList.add(doberman);
            System.out.println("Print my arrayList " + myDogList.get(1));
            Dog pinczer = new Dog();
       // this is an array list that takes all objects and they all have Object type      
            ArrayList<Object> myAnimalList = new ArrayList<Object>();
            myAnimalList.add(doberman);
            myAnimalList.add(c); 
            myAnimalList.add(takeMe(pinczer));
            System.out.println("wyszlo na " + myAnimalList.get(2));
            
            System.out.println("The index of doberman is " + myAnimalList.indexOf(doberman));
            
            Object o = myAnimalList.get(0);
            Dog lol = (Dog)o;
            lol.makeNoise();// object o regards the fact is a dog object cannot implement methods form dog class
            o.hashCode(); 
            pinczer.makeNoise();
      // Here are most commont method from core "Object class"
            
            // compare objects
            if(c.equals(doberman))
                System.out.println("true");
            else
                System.out.println("false");
            
            // prints hash code for each single object which is considered as
            // unike ID of Object
            System.out.println("This is HashCode for c " + c.hashCode()); // print hashCode of "c" 
            System.out.println("This is HashCode for d " + doberman.hashCode());
            System.out.println("This is HashCode for c " + c.hashCode());
        
            // reveals from where the object was implemented 
            System.out.println("This class comes from " + c.getClass()); // prints <package name>.<class name> 
            System.out.println("This class comes from " + wilczur.getClass());
    
        }
          public static Object takeMe(Object  l){
                System.out.println("The index of doberman is " );
                Object gad = new Dog();
                return gad;
                
         }
}


