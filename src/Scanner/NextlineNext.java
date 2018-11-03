package Scanner;

import java.util.Scanner;

public class NextlineNext {

	public static void main(String[] args) {
		
		NextlineNext obj = new NextlineNext();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter next line value");
		String str = sc.nextLine(); 
		// entered 'str value' output 'value'
		System.out.println("next line output"+" "+str);
			
		
		System.out.println("Please enter next value");
		String str1 = sc.next();
		// entered 'next line' output 'next'
		System.out.println("next output"+" "+ str1);
	}

}
