package NaveenLabs;

public class CallByRefCallByValue {
	int p = 23, q = 45;

	public static void main(String[] args) {
		
		
		CallByRefCallByValue obj = new CallByRefCallByValue();
		obj.add();      // Call by value or pass by value
		obj.swap(obj);
		 
	}
	public void add() {
		int a = 10, b = 20;
		System.out.println(a+b);
	}
	
	public void swap (CallByRefCallByValue t) {
		
		int temp = p;
		p = q;				// or call p and q with t.p t.q
		q = temp;
		 System.out.println("p"+p);
		 System.out.println("q"+q);
		 
		 System.out.println(q);
	}
}
