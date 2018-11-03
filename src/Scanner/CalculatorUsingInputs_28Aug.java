package Scanner;
import java.util.Scanner;

public class CalculatorUsingInputs_28Aug {

	void Sum(int a, int b) {
	int sum = a+b;
	System.out.println("Sum of Two Value :"+ sum);
	}
	
	void Mul(int a, int b) {
		int mul = a * b;
		System.out.println("Mul of Two Value :" + mul);
	}
	void Div(int a, int b) {
		int div = a / b;
		System.out.println("Div of Two Value :" + div);
		
	}
	void Sub(int a, int b) {
		int sub = a-b;
		System.out.println("Sub of Two Valuues :"+sub);
		
	}
	public static void main(String[] args) {
	
		int val1;
		int val2;
		int result;
		CalculatorUsingInputs_28Aug fun = new CalculatorUsingInputs_28Aug();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter val 1");
		val1 = sc.nextInt();
		
		System.out.println("please enter val2");
		val2 = sc.nextInt();
		
		fun.Div(val1, val2);
		fun.Mul(val1, val2);
		fun.Sub(val1, val2);
		fun.Sum(val1, val2);

	}

}
