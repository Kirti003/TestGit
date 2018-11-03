package NewPack;

public class StaticMethods {
        static  void test() {             //Static method 1
		
		System.out.println("We are into test Case method");
		
	} 
	static  {                   //Static method 2
		System.out.println("static block");
	}
	
	public static void Demo() {          //Static method 3

		System.out.println("we are into Static Method");
	}
	
	public static void main(String[] args) {
		StaticMethods.Demo();
		StaticMethods.test();

	}

}
