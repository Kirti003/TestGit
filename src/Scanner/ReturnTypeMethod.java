package Scanner;
import java.util.Scanner;

public class ReturnTypeMethod {
   public int Add(int a,int b) {
	  
    int sum;
    sum=a+b;		
  return sum;
    	 
     }
   
public static void main(String[] args) {
		ReturnTypeMethod var1 = new ReturnTypeMethod();
		Scanner sc = new Scanner (System.in);
		//Scanner ac = new Scanner (System.in);

		int vala;
		
		System.out.println("Please enter value A:");
		vala  = sc.nextInt();
		
		int valb;
		
		System.out.println("Please enter value B:");
		valb  = sc.nextInt();
		
		int summation;
		summation = var1.Add(vala,valb); //Want to give random arguments every time to this method
		
		System.out.println("Summation"+summation);
		
	}

}
