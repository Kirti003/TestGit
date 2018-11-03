package Interface;

public class TestBank {

	public static void main(String[] args) { //is a relationship - we are talking about interfaces
		System.out.println(USBank.min_bal);
		// variable is static in nature so it can only be called with interface reference or class name
		// variable value can not be changed it's final in nature
		HSBCClass bank = new HSBCClass();
		// overridden methods are called here- first three
		bank.credit();
		bank.debit();
		bank.MoneyTransfer();
		bank.CarLoan();
		bank.EducationLoan();
		bank.MutualFunds();
		//dynamic polymorphism 
		// child class object is refrenced by parents interface reference variable
		USBank b1 = new HSBCClass();
		b1.credit();
		b1.debit();
		b1.MoneyTransfer();
	}

}
