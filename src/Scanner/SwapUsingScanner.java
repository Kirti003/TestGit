package Scanner;
import java.util.Scanner;

public class SwapUsingScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A");
		int vala = sc.nextInt();
		
		System.out.println("Enter B");
		int valb = sc.nextInt();
		
		vala = vala + valb;
		valb = vala-valb;
		vala= vala - valb;
		
		System.out.println("Val of A " + vala);
		System.out.println("Val of B " + valb);
		
				
		
	}

}
