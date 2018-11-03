package NewPack;

public class StaticNonStatic {

	static int age = 25; 	// static and non static variables 
	int obj = 100;
	
	public static void main(String[] args) {
		method1();						//direct call
		StaticNonStatic.method1();		//add() can not be called this way 
		
		StaticNonStatic str = new StaticNonStatic();
		str.method1();
										// three ways to call static method
		str.add();						// one way to call non static method
		
		System.out.println(age);		//static global variable
										//non static = System.out.println(obj); error 
		
		System.out.println(str.obj);	//need class obj to call non static global variable

	}
	
	public static int method1() {
		int i =3, j = 5;
		int sum = i+j;
		System.out.println(sum);
		return sum;
}
	public void add () {
		int a =3, b = 9;
		int sum = a+b;
		System.out.println(sum);
	}
}
