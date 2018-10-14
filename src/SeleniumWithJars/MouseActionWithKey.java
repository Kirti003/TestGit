package SeleniumWithJars;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionWithKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://newtours.demoaut.com/");
		 	Actions act = new Actions(d);
		 	//Mouse hover at given web element with some text datain caps
		 	
		 	act.moveToElement(d.findElement(By.name("userName"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		 	// to select text use double click
		 	act.doubleClick(d.findElement(By.name("userName"))).build().perform();
	}

}
