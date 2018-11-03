package SeleniumWithJars;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class TestClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// To get A URL
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	driver.switchTo().alert().dismiss();
	
	
	driver.manage().deleteAllCookies();
	
		
		
	}

}
