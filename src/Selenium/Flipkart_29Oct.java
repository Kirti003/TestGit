package SeleniumWithJars;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_29Oct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		
	//	d.findElement(By.linkText("Login & Signup")).click();
		
		d.findElement(By.className("_2zrpKA")).sendKeys("aggarwalkirti333@gmail.com");
		d.findElement(By.cssSelector("input._2zrpKA._3v41xv")).sendKeys("9802125055");
		
		d.findElement(By.cssSelector("button._2AkmmA._1LctnI._7UHT_c")).click();
		
		//*[@id="container"]/div/header/div[1]/div/div[3]/div[1]/div/a
	}

}
