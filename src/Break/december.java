package Break;

import java.util.Scanner;

public class december {
 
	public static void main(String[] args){
		
// example 1 2:17
//java video 5 class 4 12/21/2019
//		
//	int result = sum(12,2)*2;
//		
//		System.out.println(result);
//		
//	}
//	
//	public static int sum(int a, int b) {
//		
//		return a+b;
		
		System.out.println("Give me int");
		Scanner  userInput = new Scanner(System.in);
		int userData= userInput.nextInt();
		System.out.println(oddEven(userData));

	}
	
	public static String oddEven(int number) {
// example 2 
//java video 5 class 4 12/21/2019 2:39 minutes
		if(number%2 ==0) { 
		 
			System.out.println("even");
			
		}
		else { System.out.println("odd");
			
			
		} return "are we done yet";
		
		
		
		
		
	}
	
	
}


