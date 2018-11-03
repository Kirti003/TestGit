package SeleniumWithJars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MulipleHerarchyMouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.kay.com");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		
		Actions act = new Actions(d);
	act.moveToElement(d.findElement(By.xpath("//*[@id=\'nav\']/div/ul/li[10]/a[2]"))).build().perform();
		
		Thread.sleep(3000);
		
		d.findElement(By.linkText("Giftware")).click();
		
	}

}
