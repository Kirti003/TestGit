package SeleniumWithJars;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverandTextRead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://automationpractice.com/index.php");
		 	Actions act = new Actions(d);
		 	//Mouse hover at given web element with some text datain caps
		 	act.moveToElement(d.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"))).build().perform();
		 	System.out.println("message"+d.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).getAttribute("title"));
		 	//Get the xpath of the element for which we want to get the hover message 
		 	
		 	//to select text use double click
		 	//act.doubleClick(d.findElement(By.name("userName"))).build().perform();

	}

}
