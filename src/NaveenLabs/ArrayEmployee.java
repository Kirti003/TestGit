package NaveenLabs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEmployee {

	public static void main(String[] args) {
		
		//Employee class object
		Employee e1 = new Employee("Kirti", 26, "Dev");
		Employee e2 = new Employee("Garima",27, "Dev");
		
		// Create array List
		ArrayList<Employee> are2 = new ArrayList<Employee>();
		are2.add(e1);
		are2.add(e2);
		
		//Iterate to traverse the value
		Iterator<Employee> it = are2.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.age);
			System.out.println(emp.name);
			System.out.println(emp.department);
		}
	}

}
