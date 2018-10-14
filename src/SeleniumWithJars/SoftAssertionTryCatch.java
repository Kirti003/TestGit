package SeleniumWithJars;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SoftAssertionTryCatch {
	
	
	/*static  {                   //Static method 
		System.out.println("static block");
	}*/
	
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d  = new ChromeDriver();
		d.get("http://automationpractice.com/index.php");
		
	// title is not equal to comparison value catch is not stopping compiler for execution and 'Finally' block is executed
		 String title = d.getTitle();
		// System.out.println("title "+title);
		if (title.equals("My Sto"))
	
		System.out.println("title "+title);
		else 
			System.out.println("Fail");
		try {
			 title.equals("My Sto");
			// Boolean b = title.equals("My Sto");
		// System.out.println(b);
		 }
		 catch (Exception e) {
			 System.out.println("Title Mismatch");
			// throw(e);
			 
		 }
		 
		/* finally {
			 System.out.println("Finally");
			 
		 }*/
}
}