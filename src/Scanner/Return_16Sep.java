package Scanner;

import java.util.Scanner;

public class Return_16Sep {
	
	
	int multiply (int i,int j) {              //Write return type with method nema
	return i*j;
	}

	int divide (int i, int j ) {
		return i/j;
		
	}
	
	int add (int i,int j) {
		return i+j;
	}
	
	String str () {
		//System.out.println("String Method");
		String s = "Hello";
		return s;
	}
	public static void main(String[] args) {		// Main method is void it will not return any value
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A");
		int a = sc.nextInt();
		System.out.println("Enter B");
		int b = sc.nextInt();
		
		Return_16Sep m = new Return_16Sep();
		int mul = m.multiply(a, b);				//Return type value stored in int mul n displayed on the out put 
		System.out.println("multiply"+mul);
		
		int div = m.divide(a, b);
		System.out.println("divide"+div);
		
		String S1 = m.str();
		System.out.println("String"+S1);
	}

}
