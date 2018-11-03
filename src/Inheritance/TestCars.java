package Inheritance;

public class TestCars {

	public static void main(String[] args) { //has a relationship
		BMW obj = new BMW();
		
		obj.start(); 
		//static polymorphism....compile tym polymorphism (one to many we are achieving method overriding)
		// some says its dynamic static is overloading exapmle 
		//Method overriding : same method is present in parent n child class with same name and  arguments 
		//Preference will be given to over ridden method 
		
		obj.stop();  //inherit from parent class
		obj.refule();
		obj.TheftSecurity();
		obj.engine();
		
		System.out.println("******");
		
		Car c1 = new Car();
		c1.start();
		c1.stop();
		c1.refule();
		c1.engine();
		
		System.out.println("******");
		
		//Top Casting- fitting small thing into bigger one child to parent
		Car c = new BMW();
		//Child class object can be referenced by parent class reference variable...dynamic polymorphism..runtime polymorphism 
		// we can refer child class object we cannot refer its properties i.e why only car class methods+ overriden methods we can access here 
		c.start();
		c.stop();
		c.refule();
		c.engine();
		
		System.out.println("******");
		//Down Casting fitting bigger thing into bigger it is not possible without casting
		BMW b1 = (BMW) new Car();
		// it will give class cast exception
		
		
	}
	
	

}
