package SeleniumWithJars;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Alerts_31Oct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		
	d.findElement(By.cssSelector("a.analystic")).click();
	d.findElement(By.cssSelector("button.btn.btn-danger")).click();
		
		
		Alert alert = d.switchTo().alert();
		System.out.println(alert.getText());
		 String str = alert.getText();
		  
		 Thread.sleep(3000);
		 
		 if (str.equals("I am an alert box!")) {
			 System.out.println("alert verified");
		 }else {
			 System.out.println("alert not verified");
		 }
		
		if(ExpectedConditions.alertIsPresent() != null) {
			System.out.println("Alert Verified");	
		} else{
			System.out.println("Alert not Verified");
		}
		alert.accept();
		//alert.dismiss();
		
	}

}
