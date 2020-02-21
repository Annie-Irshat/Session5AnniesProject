package Break;

public class GlobalLocal {

// java video 5 12/21/2019 at 2:56 minutes 
	
	
// global variable example 1	
//you can have multiple global variables. 	
	 
	//none static global variable 
	int a = 40;
    // static global variable
	static int b = 60; 
	
	public static void main(String[] args) {
		
		
		
	int a= 20;
	System.out.println(a);
	
	GlobalLocal objName = new GlobalLocal();
	objName.abc();
	
	System.out.println(objName.a);
	
	
	}

	
	public void abc() {
// THIS - only works with none static methods. 
		
		// local variable int a =2; was replaced by THIS.a,thus accessing int a =40;
		int a = 22;
		System.out.println(this.a);
	
		System.out.println(b);
	
	
	}
}
