package NewPack;

public class StringConstantObjectHashcode {

	
	public static void main(String[] args) {
		
		String testone = "Kirti";  //store in string constant
		String testtwo = "name";
		System.out.println("Hashcode testone"+ testone.hashCode());
		System.out.println("Hashcode testtwo"+ testtwo.hashCode());
		
		
		String test = new String ("name");   // store in heap (Memory allocation is different for two 
		System.out.println("Hashcode test"+ test.hashCode());
		
		System.out.println(testone == test);
		System.out.println(testtwo == test);
		System.out.println(testtwo.equals(test));
		
		// Append
		test = test+"Add";
		System.out.println(test); // permanent 
		testtwo = testtwo + "1Add";
		System.out.println(testone);
		System.out.println(testtwo);
		System.out.println(testtwo.equals(test));
		// append successfully dome comparing nameAdd with name1Add so resultant fail
		}

}
