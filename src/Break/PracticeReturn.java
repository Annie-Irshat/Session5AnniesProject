package Break;

import java.util.Scanner;

public class PracticeReturn {

	public static void main(String [] args) {
//return type java video 5 class 4 12/21/2019 2:39 minutes	
		System.out.println("What is our luck?");
		Scanner UserInput = new Scanner(System.in);
		int num = UserInput.nextInt();
		System.out.println(study(num));
		
	}


	public static char study(int number) {
		
		String a = "bus ticket home";
		if(number%2==0) { System.out.println("We get double $$");
			
		}else { System.out.println("We get nothing a " + a );
			
		}return 'N';
	}
	
	
}
	
	

