package NaveenLabs;

import java.util.Hashtable;

public class hashtable {

	public static void main(String[] args) {
		Hashtable h1 = new Hashtable();
		h1.put(0, "Test");
		h1.put(1,100);
		h1.put(2, 1.002);
		h1.put(3, "Test100");
		h1.put(4, "Test200");
		h1.put(5, "Test300");
		
		System.out.println(h1.size());
		
	for(int i=0;i<6;i++)
			 System.out.println(h1.get(i));
		
		Hashtable<Integer, Integer> h2 = new Hashtable<Integer, Integer>();
		h2.put(1, 199);
		System.out.println(h2.get(1));
		System.out.println(h2.size());
		
		Hashtable<String, String> h3 = new Hashtable<>();
		h3.put("key1", "value");
		System.out.println(h3.get("key1"));
		System.out.println(h3.size());
		
	}

}

