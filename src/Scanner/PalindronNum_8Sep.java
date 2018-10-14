package Scanner;
import java.util.Scanner;

public class PalindronNum_8Sep {

	public static void main(String[] args) {
		int Value,a,i=0,t;
		
		Scanner sc = new Scanner (System.in); 
		 System.out.println("enetr the value");
		 
		a= sc.nextInt();
		Value=a; 
		 while (a>0) {
		// a = sc.nextInt();
		 t = a%10;
		// System.out.println(t);
		 i = i*10+t;
		 a= a/10;
		 } 
		 System.out.println(i);
		 
		 if (Value == i) {
			System.out.println("Palindrome Number");
		} else {
			
			System.out.println("Reverse Number");
		}
	}
	

}
