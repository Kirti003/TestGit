package NewPack;

public class ObjectMethod_18Aug {
	
	static  {
		System.out.println("static block");
	}
	 static void Demo() {
		 int a= 1;
		 int b= 3;
		 int sum = a+b;
		System.out.println("sum" + sum);
	}
	
	void add() {
		System.out.println("we are into add method");
	}
	
	//statis variable 
	static int a = 2;
	//System.out.println("static variable "+a);
	
	public static void main(String[] args) {
		ObjectMethod_18Aug.Demo();
		
		ObjectMethod_18Aug call = new ObjectMethod_18Aug ();
		call.add();
		
		
		
		//System.out.println("static variable "+a);
	}
	//System.out.println("we are into main method");
}
