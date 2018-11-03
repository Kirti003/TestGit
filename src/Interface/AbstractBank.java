package Interface;

public abstract class AbstractBank {   // add abstract in class name
	//partial abstraction bcoz it contains abstract and non abstract methods
	//hiding the implementation logic 
	//cannot create the object of abstrac class i.e.AbstractBank here
	public abstract void met(); // abstract metho with no method body
	
public void debit() {
	System.out.println("debit non abstract method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
