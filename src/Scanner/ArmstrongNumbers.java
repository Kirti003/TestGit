package Scanner;
import java.util.Scanner;
public class ArmstrongNumbers {

	public static void main(String[] args) {
		int i,n,a,r=0,count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		i = sc.nextInt();
		n = i;
		while(i>0) {
			a= i%10;
			r = r+(a*a*a);
			i=i/10;
		}
	System.out.println(r);
	
	if (n==r) {
		count = count+1;
	}
	System.out.println("count"+count);
	}

}
