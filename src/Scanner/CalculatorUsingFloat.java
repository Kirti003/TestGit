package Scanner;

import java.util.Scanner;

public class CalculatorUsingFloat {
	 float Add(float a,float b ){
	float sum;
	sum=a+b;
	System.out.println("Summation"+sum);
	return sum; //print return value and use this resultant for sub method or inside main method
	}
	 
	 public void sub(float a,float b) {
		float sub;
		sub = a-b;
		System.out.println("sub"+sub+sub);
	 }
		public  float div (float a,float b) {
			float rem;
			rem= (a%b);
			System.out.println(rem);
			rem=a/b;
			System.out.println("div"+rem);
		//	System.out.println();
			
			return a;
			
		//System.out.println(a);
			//return rem;
			//System.out.println(rem);
	 }

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		float x,y;
		System.out.println("enter frst float value");
		x= s.nextFloat();
		
		System.out.println("enter secong float value");
		y = s.nextFloat();
		//z = s.nextFloat();

		CalculatorUsingFloat cal = new CalculatorUsingFloat();
		cal.Add(x, y);
		cal.sub(x,y);
		cal.div(x,y);
		//sub= sub - sum;
		
		//System.out.println(sum + sub);
	}

}
