package NaveenLabs;

import java.util.ArrayList;

public class ArrayAddAll {

	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Test1");
		ar1.add("Test2");
		ar1.add("Test3");
		
		ArrayList<String> ar2= new ArrayList<String>();
		ar2.add("Test4");
		ar2.add("Test5");
		ar2.add("Test6");
		
		//AddAll()
		ar1.addAll(ar2);
		
		for(int i=0; i<ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		
		System.out.println("************");
		//RemoveAll()
		ar1.removeAll(ar2);
		for(int i=0; i<ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		System.out.println("************");
		//RetainAll()
		
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Test1");
		ar3.add("Test2");
		
		ArrayList<String> ar4= new ArrayList<String>();
		ar4.add("Test1");
		ar4.add("Test5");
		
		ar3.retainAll(ar4);
		for(int i=0; i<ar3.size(); i++) {
			System.out.println(ar3.get(i));
	
		}

	}
}


