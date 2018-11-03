package SeleniumWithJars;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=fedb645d177d9fff8cf40618c1e3e4ed");
		d.manage().window().maximize();
		List<WebElement> testur = d.findElements(By.tagName("a"));
		int i,s;
		s = testur.size();
		System.out.println(s);
		
		for(i=0;i<s;i++){
			System.out.println(i);
		System.out.println(testur.get(i).getAttribute("href"));
		}

	}

}
