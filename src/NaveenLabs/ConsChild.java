package NaveenLabs;

public class ConsChild extends ConsParent {
	
	public ConsChild() {
		super();
		System.out.println("child  default constructor" );
	}
// super keyword should be first statement inside method. If removed default const of parent const will be called with child const
//
	public ConsChild(int j) {
		super(1000);
		System.out.println("child constructor"+ j);
	}

	public static void main(String[] args) {
		ConsChild c1 = new ConsChild();
		ConsChild c2 = new ConsChild(30);
	}

}
