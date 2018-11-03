package Interface;

public class TestAbstrac {

	public static void main(String[] args) {
		ICICIAbs c1 = new ICICIAbs();
		
		c1.met();
		c1.debit();
		c1.funds();
		
		AbstractBank c2 = new ICICIAbs();
		c2.debit();
		c2.met();
	}
	

}
