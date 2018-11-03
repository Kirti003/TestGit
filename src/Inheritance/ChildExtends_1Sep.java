package Inheritance;
import java.util.Scanner;

public class ChildExtends_1Sep extends ParentExtend_1Sep {

	public static void main(String[] args) {
		//ParentExtends_1Sep call = new ParentExtends_1Sep();
		ChildExtends_1Sep call = new ChildExtends_1Sep();
			System.out.println(call.method1());
			
			Scanner sc = new Scanner(System.in);
			int val1;
			int val2;
			System.out.println("Please enter frst value");
			val1 = sc.nextInt();
			System.out.println("Please enter second value");
			val2 = sc.nextInt();
			
			System.out.println(call.method2(val1,val2));
			
		

	}

}
