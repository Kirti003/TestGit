package Scanner;
import java.util.Scanner;

public class TableUsingInput_28Aug {

	public static void main(String[] args) {
		int num;
		int tab;
		
		System.out.println("please enter the number to generate table");
		
		Scanner sc = new Scanner (System.in);
		tab = sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			num = tab * i;
				System.out.println("2*"+i+"="+num);
			
		}

	}

}
