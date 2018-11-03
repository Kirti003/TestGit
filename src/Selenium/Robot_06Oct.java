package SeleniumWithJars;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_06Oct {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("http://newtours.demoaut.com/");
	 	 d.findElement(By.linkText("REGISTER"));
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		 robo.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click	
	        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	        
		 // press enter key of keyboard to perform above selected action	
		d.findElement(By.name("userName"));
		 robo.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click	
	        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

	}

}
