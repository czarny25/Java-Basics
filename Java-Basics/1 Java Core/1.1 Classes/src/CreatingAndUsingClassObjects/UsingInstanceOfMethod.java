package CreatingAndUsingClassObjects;

public class UsingInstanceOfMethod {

	public static void main(String[] args) {
		
		Animal animal = new Animal();

		if(animal  instanceof Animal){
			System.out.println("I'm the animal");
		}else{
			System.out.println("I'm not");
		}
		
	}

}

class Animal{
	
}