package NaveenLabs;

import java.util.*;

//java.util.LinkedList

public class CollLinkList {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(100);
		System.out.println(ll.size());
		System.out.println(ll.get(0));
		ll.add(1, 300);
		System.out.println(ll.size());
		System.out.println(ll.get(1));
		
		ll.removeLast();
		System.out.println(ll.size());     //it will remove last index added value
		System.out.println("**************last");
		
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("main");
		obj.addLast("last");
		System.out.println("index 0" +obj.get(0));
		System.out.println("index 1" +obj.get(1));
	
		obj.set(0, "element");             //it will change 0 index item value from main to element
		System.out.println("index 0" + obj.get(0));
		
		System.out.println("**************string1");
		
		LinkedList<String> obj1 = new LinkedList<String>();
		obj1.add("new");
		obj1.add("upd");
		obj.addAll(obj1);
		//System.out.println("updated obj" +obj1);    //it will add all output updated obj[new, upd]
		
		System.out.println("**************string2");
		
		// how to print all the values of LinkedList 
		//using For loop
		for(int i =0; i<obj.size(); i++) {
			System.out.println(obj.get(i));
		}
		//Using advance java	
	//	for(String str : obj1) {
	//	System.out.println(obj1);
	//	}
		//Iterator
		System.out.println("**************iterator");
		
		Iterator<String> it = obj1.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());  
		}
		System.out.println("**************while");
		
	int num =0;	
	while(obj.size()>num){
		System.out.println(obj.get(num));
		num++;
	}
		
	}

	}


