package NaveenLabs;

import java.util.LinkedList;

public class CollLinkList2 {

	public static void main(String[] args) {
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("main");
		obj.addLast("last");
		System.out.println("index 0" +obj.get(0));
		System.out.println("index 1" +obj.get(1));
	
		obj.set(0, "element");             //it will change 0 index item value from main to element
		System.out.println("index 0" + obj.get(0));
		System.out.println("**************");
		for(int i =0; i<obj.size(); i++) {
			System.out.println(obj.get(i));
		}
		
		System.out.println("**************string1");
		
		LinkedList<String> obj1 = new LinkedList<String>();
		obj1.add("new");
		obj1.add("upd");
	//	obj.addAll(obj1);
		//System.out.println("updated obj" +obj1);    //it will add all output updated obj[new, upd]
		
	for(String str : obj1) {
		System.out.println(obj1);
				}
		System.out.println("**************string3");
		

		LinkedList<String> obj2 = new LinkedList<String>();
		obj2.add("new");
		obj2.add("upd");
		
		for(String str : obj2) {
			System.out.println(obj2);
					}
		
	}

}
