package _5;

import java.util.ArrayList;
import java.util.List;

public class ReplaceZeros {

	
	static int[][] matrix = {{1, 2, 3, 4, 23},{5, 0, 7, 40, 56},{9, 10, 11, 12, 67},{70 ,14 ,40 ,16 , 89},{17 ,56 ,60 ,20 ,0}};
	
	public static void main(String[] args) {

		zeroReplacer(matrix);
		
	}

	public static void zeroReplacer(int[][] m) {
		
		List<int[]> coordinates = new ArrayList();
		int count = 0;
		
		for(int j = 0; j < m.length; j++){			
			for(int i = 0; i < m[j].length; i++){
				if(m[j][i] == 0){
					//System.out.print("Found one at " + j + ", " + i);
					int[]nums = {j,i};
					coordinates.add(nums);
				}
				System.out.printf("%4d", m[i][j]);
			}System.out.println();
					
		}
		
		System.out.println();
		
		for(int [] i : coordinates){		
			//for(int j = 0; j < i.length; j++){
				//System.out.println(i[j] + ", ");
				for(int n = 0; n < i[0]; n++){
				
					//System.out.print(i[0]+ "," + n + "  --  " );	
					//System.out.print(m[i[0]][n] + "  --  " );
					m[i[0]][n] = 0;
					
					
				}
				for(int n = i[0]; n < m.length; n++){
					
					//System.out.print(i[0]+ "," + n + "  --  " );
					//System.out.print(m[i[0]][n] + "  --  " );
					
					m[i[0]][n] = 0;
					
				}System.out.println();
				
				for(int n = 0; n < i[1]; n++){
					//System.out.print( n + "," +  i[1]+"  --  " );
					//System.out.print(m[i[1]][n] + "  --  " );
					
					m[n][i[1]] = 0;
					
				}
				for(int n = i[1]; n < m.length; n++){
					//System.out.print( n + "," +  i[1]+"  --  " );
//					System.out.print(m[i[1]][n] + "  --  " );
					
					m[n][i[1]] = 0;
					
				}System.out.println();
				
			//}System.out.println();
				
		}
			
		for(int j = 0; j < m.length; j++){			
			for(int i = 0; i < m[j].length; i++){
				
				System.out.printf("%4d", m[i][j]);
			}System.out.println();
					
		}	
		
		
		
	}

}
