package SeleniumWithJars;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorUsingProperties {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\Test.properties");
			Properties pro = new Properties();
			pro.load(fs);
			System.out.println(pro.getProperty("Url"));
			System.out.println(pro.getProperty("FirstName"));
			System.out.println(pro.getProperty("Lastname"));
			
			d.get(pro.getProperty("Url"));
			// below line is getting value from property file containg FirstName and Lastname
			d.findElement(By.name("firstName")).sendKeys(pro.getProperty("FirstName"));
			d.findElement(By.name("lastName")).sendKeys(pro.getProperty("Lastname"));
			
			WebElement driver = d.findElement(By.id("continents"));
			Select Value = new Select(d.findElement(By.id("continents")));
			//Value.selectByIndex(1);
			Value.selectByVisibleText(pro.getProperty("country"));
			/*
			 * driver.get(prop.getProperty("URL"));
		driver.findElement(By.id("Email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("Passwd")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("SignIn")).click();
			 */
	
		
		

	}

}
