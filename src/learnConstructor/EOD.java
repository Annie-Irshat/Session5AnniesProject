package learnConstructor;
//constructor - special method
public class EOD {
// Java video 5 class 5 12/21/2019 at 25 minutes. 
	
	public EOD(int a) {
	this("more passengers"); // string
	System.out.println("print:"  + a); 
	
	
	}

	public EOD(int a, String b ) {
	this(a);//int
	System.out.println("print:"  + a + b);

	}
	
	public EOD(String a) {
	System.out.println("print:"+ a );
	}

	public EOD(String a, int b) {
	System.out.println("print:" + a + b);

	}
	
	public static void abc() {
	System.out.println("no parameter");
	}

	
	public static void abc(int a) {
	System.out.println("parameter with int "+ a);	
		
	}
}



