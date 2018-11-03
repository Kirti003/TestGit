package SeleniumWithJars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		 System.out.println(d.getTitle()); 
		 String str = d.getTitle();
		
		 String url =  d.getCurrentUrl();
		 System.out.println(url); //replace Title with url to verify url in same way
		 
		 if (str.equals("Demo Form for practicing Selenium Automation")) {
			 System.out.println("Comparison pass");
		 }
		 else{
			 System.out.println("comparison fail");
		 }
		 boolean data = str.equals("Demo Form for practicing Selenium Automation");
		 System.out.println(data);
	}

}
