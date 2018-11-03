package SeleniumWithJars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_28oct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://a.testaddressbook.com/addresses/new");
		d.manage().window().maximize();
		d.findElement(By.id("session_email")).sendKeys("aggarwalkirti333@gmail.com");
		d.findElement(By.name("session[password]")).sendKeys("123456");
		d.findElement(By.name("commit")).click();
		
		if(d.getPageSource().contains("aggarwalkirti333@gmail.com")) {
			System.out.println("User Verified");
		}else {
			System.out.println("User not Verified");
		}
			
	Select value = new Select(d.findElement(By.id("address_state")));
	value.selectByVisibleText("Florida");
	}
	

}
