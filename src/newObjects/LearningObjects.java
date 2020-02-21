package newObjects;

public class LearningObjects {

	public static void main(String[] args) {
//method learning 
// java video 5 from class 4 (12/21/2019)

//this is for calling static method to another static method 
//		 LearningObjects practice = new  LearningObjects();

//		  LearningObjectsTwo practice2 = new LearningObjectsTwo();
//		  practice2.abc("test");

	
//this is for calling a method from a different class
//		//examples
		
//		LearningObjectsTwo.test();
		
		LearningObjects.gottoSleep();
		
	}
	
	
		public static void gottoSleep() {
			System.out.println("sleep");
			
		}
	
	
		
		public void NoMain() {
			LearningObjects.gottoSleep();
			
			LearningObjectsTwo objname = new LearningObjectsTwo();
			objname.nonstat();
			
			
		}
		


 
			
		
}
