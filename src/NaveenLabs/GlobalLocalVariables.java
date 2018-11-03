package NaveenLabs;

public class GlobalLocalVariables {
	
	// Global Variables
	int i = 1;
	int j = 2;
	String st = "Global Variables";
	
	

	public static void main(String[] args) {
		// local variable for main method
		int i = 3;
		String str = "Data";
		System.out.println(i);       // will print local variable value that is i = 3;
		System.out.println(str);
		
		GlobalLocalVariables var = new GlobalLocalVariables();   //class object is needed to call global variables
		System.out.println(var.sum());
		
		System.out.println(var.i);		// global variable 
		//System.out.println(st);
		System.out.println(var.j);
	}
		
		public int sum() {  			//local variable for sum method 
			int k =  j;
			
			return k;
		}
		
	

}
