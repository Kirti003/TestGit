package SeleniumWithJars;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimulationBackForw {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.jared.com/en/jaredstore/cms/jared-charms");
		d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		
		d.get("http://automationpractice.com/index.php");
		d.navigate().back();
		d.navigate().forward();
		d.navigate().refresh();
		
		
	}
}
