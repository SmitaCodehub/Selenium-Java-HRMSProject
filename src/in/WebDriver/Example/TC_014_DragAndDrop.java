package in.WebDriver.Example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertEquals;
public class TC_014_DragAndDrop {

	public static void main(String[] args) throws Exception {

//System.setProperty("webdriver.chrome.driver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
//		2. enter url
		WebDriver driver=new ChromeDriver(options);
	driver.navigate().to("https://jqueryui.com/droppable/");
	Thread.sleep(2000);
	
	// Veriify title: Condition fails:stop execution
	
	assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	System.out.println("Title MAtched");
	
	driver.switchTo().frame(0);
	Actions ac=new Actions(driver);
	ac.dragAndDrop(driver.findElement(By.id("droppable")), driver.findElement(By.id("droppable")));
	
	Thread.sleep(4000);
	System.out.println("Drag and dro completed");
	
	driver.switchTo().defaultContent();
	driver.quit();
	
	}

}
