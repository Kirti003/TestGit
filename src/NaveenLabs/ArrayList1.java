package NaveenLabs;
import java.util.ArrayList;
public class ArrayList1 {

	public void add(int index, Object element) {
		
	}
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(1,200);
		ar.add(2,200);
		ar.add("Abhishek");

		ar.add("Abhishek");
		System.out.println(ar.size());
		//ar.add(2,"Hello");
		//ar.add(3,9.0023f);
		//ar.add(4, "eyuhu3");
		
	//ar.add(5,"H");*/
for (int i = 1;i<ar.size();i++) {
	System.out.println(ar.get(i));
}
/*
System.out.println(ar.size());

ArrayList<Integer> ar1 = new ArrayList();

System.out.println(ar1.add(100));

ArrayList<String> ar2 = new ArrayList();

System.out.println(ar2.add("String1"));
//*******************************************
*/

	}

	
}
