package Constructor;

public class FrstProg {
	
	public  FrstProg() {	 
		System.out.println("We are into Constructor Method1");
	}
	
	public  FrstProg(int a) {
		System.out.println("We are into Constructor Method2");
	}
	
	public void Method1() {
		System.out.println("We are into Method");
	}
	
	public void Method2() {
		System.out.println("We are into Method2");
	}
	
	public static void main(String[] args) {
	
		FrstProg fp = new FrstProg();
		// creating object with class name will automatically execute constructor
		FrstProg fp1 = new FrstProg(5);
		fp.Method1();
		//FrstProg obj = new FrstProg();
	//	obj.Method1();
		//obj.Method2();
		
		
	}

}
