package Assignment4;

import java.util.Scanner;

public class ClassTwo {

	public ClassTwo(int a) {
		
		System.out.println("Iam "+29+"!");
	
	}
	
	public ClassTwo(String b, int c) {
		
		System.out.println("I graduated from "+b+ " in"+" " +c+".");
	
	}
	

	public ClassTwo(double number) {
		System.out.println("My goal is to save " +number+ " for a house.");
		
	}
	
	
	public ClassTwo(boolean child) {
		
		System.out.print("Am I a mom?...");
		System.out.println(true);
	}
	
	
     /* Private: the access level of a "private" modifier is only within the class. 
      * Cannot be accessed from outside of the class 
      */
	
	/*Default: the access level of default modifier is only within the package
	 * it can't be accessed from outside of the package.*/
	
	/* protected: the access level of the protected modifier is within the package 
	 * and outside the package through child class*/
	
	/* public: the access level of a public modifier is everywhere,
	 * it can be accessed within class, outside of class and within
	 *  the package/outside of package */
}


