package SeleniumWithJars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver d = new ChromeDriver();
		//verification of text, user name, url
		d.get("http://newtours.demoaut.com/create_account_success.php?osCsid=fedb645d177d9fff8cf40618c1e3e4ed");
		//d.findElement(By.linkText("Dear")).isDisplayed();
		//d.findElement(By.linkText("Welcome back to Mercury Tours!.")).isDisplayed();
		d.findElement(By.tagName("a")).equals("using the user name and password you've just entered.\r\n");
		d.findElement(By.tagName("b")).equals("Dear");
		d.findElement(By.tagName("b")).equals(" Note: Your user name is .");
		d.findElement(By.linkText("sign-in")).click();
		d.findElement(By.name("userName")).sendKeys("Kirti");
		d.findElement(By.name("password")).sendKeys("password");
		d.findElement(By.name("login")).click();
		
	}

}
