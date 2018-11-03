package SeleniumWithJars;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_15Sep {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver d = new ChromeDriver();
		d.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=fedb645d177d9fff8cf40618c1e3e4ed");
		d.manage().window().maximize();
		List<WebElement> testurl = d.findElements(By.tagName("a"));
		int i,size;	
		size= testurl.size();
		System.out.println(size);
		for( i=0;i<size;i++) {
		System.out.println(testurl.get(i).getAttribute("href"));
		
		}
	}

}
