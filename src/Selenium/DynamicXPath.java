package SeleniumWithJars;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicXPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://automationpractice.com/index.php");
		d.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions act = new Actions(d);
		
		//id = test_123
		//id = test_btn_5656
		//WebElement Cart = d.findElement(By.xpath("//input[contains(@id,'test')]"));
		//WebElement Cart = d.findElement(By.xpath("//input[starts-with(@id,'test')]"));
		
		//id = 5657_test_t
		//WebElement Cart = d.findElement(By.xpath("//input[ends-with(@id,'test')]"));
		
		//for links 
		//WebElement Cart = d.findElement(By.xpath("//b[contains(text(),'Cart')]"));
		WebElement Cart = d.findElement(By.xpath("//b[contains(text(),'Cart')]"));
		act.moveToElement(Cart).build().perform();
		//act.moveToElement(Cart).click().build().perform();
		System.out.println("message"+ " "+Cart.getAttribute("title"));
		
		
	}

}
