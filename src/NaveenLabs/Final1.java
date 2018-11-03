package NaveenLabs;

public class Final1 {
	//prevent Inheritance
	//public final class Final1
//The type FinalChild cannot subclass the final class FinalFinally
	//class name cointain final it can not be extended to other class as parent class
	
	public void add() {
		System.out.println("a");
	}
	//prevent method overriding:public final void add() 
	//create same methods name in parent n child class. if final is added with
	//parent. child class method will give error
	//Cannot override the final method from FinalFinally
	public static void main(String[] args) {
		// Final
	final	int i = 10;
	// On assining some value to i=12. it will give error:The final local variable 
//	i cannot be assigned. It must be blank and not using a compound assignment 
	}

}
