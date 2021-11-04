package GarbageCollection;


class SomeResources extends Object{

	public void close() {
		// TODO Auto-generated method stub
		
	}

}

public class WellBehavedClass {
	
	SomeResources objRef = new SomeResources();
	
	
	public static void main(String args[]){
		
		WellBehavedClass w = new WellBehavedClass();
		try {
			w.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	protected void finalize() throws Throwable{
		
		try{
			if(objRef != null)
				objRef.close();
				objRef = null;
		}finally{
			super.finalize();
			System.out.println("all closed");
		}
	}

}
