package NaveenLabs;

public class TryCatchFinally {

	public static void main(String[] args) {
	test1();
	test2();
	test3();
	test4();
	}
	
	public static void test1() {
		try {
			System.out.println("test1");
			System.out.println("inside test method");
			throw new RuntimeException("test");
			
		}catch(Exception e) {
			System.out.println("inside catch block");
		}
		
		finally
		{
			System.out.println("inside finally block 1");
		}
	}
	
	public static void test2() {
		try {
			System.out.println("test2");
		}
		finally {
			System.out.println("inside finally block 2 method");
		}
		
	}
	// run time exception
	public static void test3() {
		try {
			System.out.println("test3");
			int i = 10;
			int r = i/0;
			System.out.println(r);
		}catch(Exception e){
			System.out.println("Runtime Exception divide by zero error");
		}finally {
			System.out.println("inside finally block 3");
		}
	}
	
	public static void test4() {
		try {
			System.out.println("test4");
			int i = 10;
			int r = i/0;
			System.out.println(r);
		}catch(NullPointerException e){
			System.out.println("Runtime Exception divide by zero error");
		}finally {
			System.out.println("inside finally block 4");
		}
	}

}


