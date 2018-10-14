package SeleniumWithJars;

public class Hashcode {

	
	public static void main(String[] args) {
		
		String testone = "Kirti";
		String testtwo = "name";
		System.out.println("Hashcode testone"+ testone.hashCode());
		System.out.println("Hashcode testtwo"+ testtwo.hashCode());
		
		
		String test4 = new String ("name");
		System.out.println("Hashcode test4"+ test4.hashCode());
		
		System.out.println(testone == test4);
		System.out.println(testtwo == test4);
		System.out.println(testtwo.equals(test4));
		}

}
