package Problems;

public class Convertions {

	public static void main(String args[]){
		
//		for (int i = 1; i <= 2; i++) {
//			for (int j = 1; j <= 3; j++) {			
//				for (int k = 1; k <= 4; k++) {
//					System.out.print("*");
//				}
//				System.out.print("!");
//			}
//			System.out.println();
//		
//		}
//	
	
//	Now the same but in while loop
		
		int i = 1;		
		while(i <= 2){			
			
			int j = 1;
			while(j <= 3){
				
				int k = 1;
				while(k <= 4){
					System.out.print("*");
					k++;
				}
				System.out.print("!");
				j++;
			}
			System.out.println();
			i++;
		}

		int num = 4;
		int count = 1;
		while(count <= num ){
			System.out.println(num);
			num /= 2;
		}
		
	}

}
