package staticImport;

//this class present how to use static import
//on two examples


//After static imports:

import static java.lang.System.out; // 1
import static java.lang.Integer.*; // 2

	public class TestStaticImport {
		public static void main(String[] args) {
			out.println(MAX_VALUE); // 3
			out.println(toHexString(42)); // 4
		}
}
	
//Before static imports:
class TestStatic {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(42));
	}
}


