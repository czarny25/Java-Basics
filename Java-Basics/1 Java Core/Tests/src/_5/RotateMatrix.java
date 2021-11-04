package _5;

public class RotateMatrix {

	static int[][] matrix = {{1, 2, 3, 4, 23},{5, 6, 7, 8, 56},{9, 10, 11, 12, 67},{13 ,14 ,15 ,16 , 89},{17 ,18 ,19 ,20 ,27}};
	
	public static void main(String[] args) {

		rotateMatrix90(matrix);
	}

	private static void rotateMatrix90(int[][] m) {
		
		for(int n = 0; n < 4; n++){
		for(int j = 0; j < m.length; j++){			
			for(int i = 0; i < m[j].length; i++){
				System.out.print(m[i][j] + " ");
			}System.out.println();
		}
	
		System.out.println();
		System.out.println();
		
		int length = m.length;
		System.out.println(length);
		System.out.println();
		
		for(int i = 0; i < length/2  ; i++){
			
			for(int j = 0; j < (length - 1)/ (i + 1) ; j++){	
				
		 		//System.out.println(m[m.length-1 - i][j + i] + " = " + m[j + i ][i]);
				int temp1 = m[m.length-1 - i][j + i];				
				m[m.length-1 - i][j+ i] = m[j + i][i];
		 		//System.out.println(m[m.length-1 - j - i][m.length-1 - i] + " = " + m[m.length-1 - i][i + j]);
		 		int temp2 = m[m.length-1 - j - i][m.length-1 - i];		 		
		 		m[m.length-1 - j - i][m.length-1 - i] = temp1;		 		
		 		temp1 = m[i][m.length-1 - j - i];
		 		//System.out.println(m[i][m.length-1 - j - i] + " = " + m[m.length-1 - j - i][m.length-1 - i]);
		 		m[i][m.length-1 - j - i] = temp2;		 		
		 		m[j + i][i] = temp1;
		 		//System.out.println(m[j + i][i] + " = " + m[i][m.length-1 - j - i ]);
		 		//System.out.println();
			}
		}
		}
		System.out.println();
		
		for(int j = 0; j < m.length; j++){			
			for(int i = 0; i < m[j].length; i++){
				System.out.format("%3d", m[i][j]); 
				//System.out.printf(m[i][j] + " ");
			}System.out.println();
		}
	
	
	
	}
	
}
