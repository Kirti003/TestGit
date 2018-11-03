package NaveenLabs;

public class WrapperClass {

	public static void main(String[] args) {
		String str = "100";
		System.out.println(str+10); 		//conversion of string to int using parseint method
		int y = Integer.parseInt(str);
		System.out.println(y+10);
		
		String st = "12.11";				//Conversion of string to double 
		System.out.println(st);
		double d = Double.parseDouble(st);
		System.out.println(d+10);
		
		String k = "true";					// conversion of string to b
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		int i = 10;
		System.out.println(i+10);
		String h = String.valueOf(i);
		System.out.println(h+10);
		
		String u = "100A";
		int g = Integer.parseInt(u);
		System.out.println(g);
		
		

	}

}
