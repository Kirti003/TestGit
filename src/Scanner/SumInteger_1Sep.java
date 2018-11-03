package Scanner;

import java.util.Scanner;

public class SumInteger_1Sep {

	public static void main(String[] args) {
	
		int n,x,sum =0;
		Scanner obj = new Scanner(System.in);
		System.out.println("value");
		n = obj.nextInt();

		while(n>0){
			x = n%10;
			//y = x;
			n = n/10;
			sum = sum + x ;
			//System.out.println(sum);
		}
		System.out.println("Sum"+sum);
	}

}
