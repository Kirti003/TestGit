package SeleniumWithJars;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

public class MouseActions_6Oct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://newtours.demoaut.com/");
		 	Actions act = new Actions(d);
		 	//Mouse hover at given web element
		 	WebElement move = d.findElement(By.linkText("SIGN-ON"));
		 	act.moveToElement(move).build().perform(); 
		 	//Right Click
		 	//act.contextClick(move).build().perform();
		 	//Click
		 	act.click(move).build().perform();
		 	//navigate back
		 	d.navigate().back();
		 	//get title
		 	String str = d.getTitle();
		 	System.out.println(str);
		 	//double click
		 	act.doubleClick(d.findElement(By.linkText("REGISTER"))).build().perform();
		 	act.click(d.findElement(By.name("firstName"))).build().perform();
		 	act.moveToElement(d.findElement(By.name("firstName"))).keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		 			 	
	}

}
