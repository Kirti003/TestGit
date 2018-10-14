package SeleniumWithJars;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial_22Sep {

	
		
		public static int getHttpCode(String testUrl) throws IOException { 
			int httpResponse;
// test url is created to avoid hard coded value of url 
			URL url = new URL(testUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();   //?  
			connection.connect();
			httpResponse = connection.getResponseCode();
			//System.out.println(httpResponse);
			return httpResponse; 
	}

	public static void main(String[] args) throws IOException {

		// Set the system proeprty for Browser with Driver path
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		// initialization of Browser
		WebDriver driver = new ChromeDriver();
		// Url for which You would to check
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		List<WebElement> urllist = driver.findElements(By.tagName("a"));

		for (int r=0; r <urllist.size();r++ ) {
			
			
		//System.out.println("http code " +getHttpCode(urllist.get(r).getAttribute("href")));
		System.out.println(urllist.get(r).getAttribute("href"));
		System.out.println(Trial_22Sep.getHttpCode(urllist.get(r).getAttribute("href")));
        // System.out.println("http Code of the URl " + urllist.get(r).getAttribute("href") + "    :"
		//+getHttpCode(urllist.get(r).getAttribute("href"))); //?
		}
	
		}

	
	}


