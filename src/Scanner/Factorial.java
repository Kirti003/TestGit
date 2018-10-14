package Scanner;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f=1,i,r=2;
		System.out.println("Enter any value");
		i = sc.nextInt();
		System.out.println(i);
		
		 while (r<=i) {
			 f =f*r;
			// System.out.println("test1"+f);
			//r= ++r; 
			 r=r++;
			 
			//System.out.println("ok"+r);
		 }
		
		  System.out.println(f);

	}

}
