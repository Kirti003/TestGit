package Scanner;
import java.util.Scanner;


public class Reverse_1Sep {

	public static void main(String[] args) {
		
		int x,y,m,n,a = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("value");
		n = obj.nextInt();

		/*x = n%10;
		y = n/10;
		System.out.println("value of x"+x);
		System.out.println("value of y"+y);
		System.out.println("Reverse Value"+x+y);
		*/
		while(n>0){
			x = n%10;
			System.out.println(x);
			a = a* 10 +x;
			n = n/10;
			System.out.println(n);
	
		}
		System.out.println("Reverse Value"+a+a);
	
	}

}
