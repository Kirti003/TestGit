package Interface;

public class HSBCClass implements USBank, BrazilBank{
	
	public void credit(){
		System.out.println("HSBC....Credit");
	}
	
	public void debit(){
		System.out.println("HSBC....debit");
	}
	
	public void MoneyTransfer(){
		System.out.println("HSBC....MoneyTransfer");
	} 
	
	public void EducationLoan(){
		System.out.println("HSBC....Education....Loan");
	}
	
	public void CarLoan(){
		System.out.println("HSBC....Car....Loan");
	}
	
	public void MutualFunds() {
		System.out.println("HSBC....mutual fund");
	}
	public static void main(String[] args) {
		USBank b2 = new HSBCClass();
		b2.credit();
		b2.debit();
		b2.MoneyTransfer();
		
		BrazilBank b3 = new HSBCClass();
		b3.MutualFunds();  // only this can be called with this object 
		
		//to call edu loan n car loan obj should be created for child class
		// only overridden methods are called 
	}
	
}
