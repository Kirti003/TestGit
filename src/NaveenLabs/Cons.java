package NaveenLabs;

public class Cons {
	String name;
	int age;
	
	String str = "key";
	
	public Cons(String name, int age) {
		this.age = age;	
		this.name = name;
		System.out.println(age);
		System.out.println(name);
	}
	public Cons(String str) {
		this.str = str;
		System.out.println(str);
	}

	public static void main(String[] args) {
		Cons b = new Cons("tom" , 100);
		Cons b1 = new Cons("new");	
		
	}

}
