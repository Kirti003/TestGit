package Scanner;

import java.util.Scanner;

public class Return_16Sep {
	
	
	int multiply (int i,int j) {
	return i*j;
	}

	int divide (int i, int j ) {
		return i/j;
		
	}
	
	int add (int i,int j) {
		return i+j;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A");
		int a = sc.nextInt();
		System.out.println("Enter B");
		int b = sc.nextInt();
		
		Return_16Sep m = new Return_16Sep();
		int mul = m.multiply(a, b);
		System.out.println("multiply"+mul);
		
		int div = m.divide(a, b);
		System.out.println("divide"+div);
	}

}
