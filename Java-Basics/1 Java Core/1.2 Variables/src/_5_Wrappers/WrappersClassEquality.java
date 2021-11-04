package _5_Wrappers;

public class WrappersClassEquality {

	public static void main(String[] args) {
		
		Integer i1000A = 13 * 10;
		Integer i1000B = 130 * 1;
		
		Double i1000C = 12.0 * 10;
		Double i1000D = 120.0 * 1;
		
		
		
//		System.out.println(i1000A + " -- " + i1000B);//		
//		System.out.println(i1000A == i1000B);//		
//		System.out.println(i1000A.equals(i1000B));// 		
		
		System.out.println(i1000C == i1000D);		
		System.out.println(i1000C.equals(i1000D));
		
		
	}

}
