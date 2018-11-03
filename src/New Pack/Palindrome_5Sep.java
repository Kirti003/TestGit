package NewPack;

public class Palindrome_5Sep {

	public static void main(String[] args) {
		String s ="madam";
		String t = "";
		int i;
		for (i= s.length()-1; i>=0; i--) {
			t = t + s.charAt(i);
			
		}
		System.out.println(t);
		
if (s==t) 
{
	System.out.println("Value entered is palindrome type");
}
else {
	System.out.println("Value type is not Palindrome");
}
	}

}
