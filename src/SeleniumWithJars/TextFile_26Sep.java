package SeleniumWithJars;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFile_26Sep {

	
		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			
			File file = new File("C:\\Users\\lenovo\\Desktop\\Test.txt");
			// Declare File object
			
			Scanner sc = new Scanner(file);
			// initialize the scanner
			
			//String str = sc.nextLine();
			// iterate through the file line by line
			sc.nextLine();
			//System.out.println(str); 
			int count = 0;
			 while (sc.hasNextLine()) //print the next line 
			{ 
				// count++;
				 //if (count ==2) {
			//System.out.println(sc.hasNextLine());
			System.out.println(sc.nextLine()); // check if there is a next line again
			/* hasNextLine() method of Scanner class of java.util package. This method returns a boolean data type 
			 * which corresponds to the existence of new line on the String tokens which the Scanner object holds
			 */
	
			 }
	}

}
