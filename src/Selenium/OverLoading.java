package SeleniumWithJars;

public class OverLoading {
	static void Add() {
		int a =0,b=3;
		System.out.println("Sum of values"+(a+b));
	}
    void Add (int a, int b) {                  // two valu
    System.out.println("Sum of values"+(a+b));
    }
/*
 * void cal (int a, int b) {
    System.out.println("Sum of values"+(a+b));
    }
 */
    void cal (int a,int b) {
    	System.out.println("Sub of values"+(a - b));
    }
    
    void cal (int a,int b, int c) {
    	System.out.println("Mul and Sub of values"+((a * b)- c));
    }
     
    void cal (float a, float b) {
    	System.out.println("Divide"+(a/b));
    	
    }
	public static void main(String[] args) {
	Add();
	OverLoading obj = new OverLoading(); 
	// calling through simple class name only or we have specific method for overloading like scanner n other
	
	obj.Add(10, 20);
	obj.cal(27.4f, 9.4f);
	obj.cal(2, 3, 4);
	obj.cal(20, 40);
	

	}

}
