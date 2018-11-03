package SeleniumWithJars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe\\");
WebDriver d = new ChromeDriver();
	d.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=fedb645d177d9fff8cf40618c1e3e4ed");
	d.manage().window().maximize();
	d.findElement(By.linkText("REGISTER")).click();
	d.findElement(By.name("firstName")).sendKeys("kirti");
	d.findElement(By.name("lastName")).sendKeys("singhal");
	d.findElement(By.name("phone")).sendKeys("9886657333");
	d.findElement(By.id("userName")).sendKeys("123@gmai.com");
	d.findElement(By.name("address1")).sendKeys("address1");
	d.findElement(By.name("address2")).sendKeys("address2");
	d.findElement(By.name("city")).sendKeys("delhi");
	d.findElement(By.name("state")).sendKeys("Haryana");
	d.findElement(By.name("postalCode")).sendKeys("122016");
	d.findElement(By.name("country")).sendKeys("ANDORRA ");
	
	d.findElement(By.name("email")).sendKeys("USER");
	d.findElement(By.name("password")).sendKeys("password");
	d.findElement(By.name("confirmPassword")).sendKeys("password");
	d.findElement(By.name("register")).click();
	}

}
