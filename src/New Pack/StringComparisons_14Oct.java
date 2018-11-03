package NewPack;

public class StringComparisons_14Oct {

	public static void main(String[] args) {
		String str = new String ("kirti");
		StringBuffer strbuff = new StringBuffer ("kirti");
		System.out.println(str.equals(strbuff));
		System.out.println(strbuff.toString().equals(str));
		
		// strbuff is converted to string by using .toString method 
		// Without this these are two different classes
		
		System.out.println(strbuff+"Test"); //Concatenation 
		System.out.println(strbuff);
		strbuff.append("Add");             //Permanent Change
		System.out.println(strbuff);
		
	

	}

}
