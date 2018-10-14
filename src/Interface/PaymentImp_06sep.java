package Interface;

public class PaymentImp_06sep implements PaymentInter_06sep {

	public void Add() {
		System.out.println("we are into add");
	}
	
	@Override
	public void AddToCart() {
		System.out.println("AddToCart");	
	}
	
	@Override
	public void Shopping() {
		System.out.println("Shopping");	
		
	}
	
	
	public void BillGenerate() {
		System.out.println("BillGenerate");		
		
	}
	
	public static void main(String[] args) {
		PaymentImp_06sep d = new PaymentImp_06sep();
		d.Add();
		d.AddToCart();
		d.Shopping();
		d.BillGenerate();
		
		PaymentInter_06sep dr = new PaymentImp_06sep();
		dr.Shopping();
		dr.AddToCart();
		dr.BillGenerate();
	}
	
	}

