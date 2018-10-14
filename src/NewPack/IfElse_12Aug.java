package NewPack;

public class IfElse_12Aug {

	public static void main(String[] args) {
		int x = 7;
		if (x>=60){
			System.out.println("student pass with first divison");			
	}
		else if (x>=50 && x<60) {
			System.out.println("student pass with second divison");	
		}
	/*	elseif(x>=50 && x<60){
			System.out.println("student pass with second divison");	
		}
		*/
		
		else {
			System.out.println("Fail");
		}
	
	}
}