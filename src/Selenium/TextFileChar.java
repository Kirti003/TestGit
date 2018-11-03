package SeleniumWithJars;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileChar {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\lenovo\\Desktop\\Test.txt");
		// Declare File object
		
		Scanner sc = new Scanner(file);
		// initialize the scanner
		
		System.out.println(sc.nextLine());
		

			while(sc.hasNext()) {
			String cht = sc.nextLine();
			System.out.println(cht);
			 int i = cht.length();
		System.out.println(i);
			
			
		}
	}
}
	
	
