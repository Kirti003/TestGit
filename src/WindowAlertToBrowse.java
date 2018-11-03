package SeleniumWithJars;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WindowAlertToBrowse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://html.com/input-type-file/");
		d.manage().window().maximize();
		
		Thread.sleep(5000);
		// Cancel the alert on browser
		
		/*Alert alert = d.switchTo().alert();
		System.out.println(alert.getText());
		 String str = alert.getText();
		
		if(ExpectedConditions.alertIsPresent() != null) {
			System.out.println("Alert Verified");	
		} else{
			System.out.println("Alert not Verified");
		}
		alert.accept();*/
		
		d.findElement(By.id("fileupload")).sendKeys("C:\\Users\\lenovo\\Desktop\\1important links.docx");
		
	}

}
