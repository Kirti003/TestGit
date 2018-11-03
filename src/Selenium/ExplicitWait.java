package SeleniumWithJars;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			
			d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			d.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
			
			
	}
	public static void clickon(WebDriver d, WebElement locator, int timeout) {
	//	new WebDriverWait(driver, timeout)
	}

}
