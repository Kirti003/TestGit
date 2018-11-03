package SeleniumWithJars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop_1Nov {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);   // search frames using right click page source cntrl+f find frames
		WebElement draggable = d.findElement(By.xpath("//*[@id=\'draggable\']/p"));
		WebElement droppable = d.findElement(By.xpath("//*[@id=\'droppable\']"));
		
		Actions act = new Actions(d);
		act.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
		
		//act.dragAndDrop(draggable, droppable);
		
			}
	

}
