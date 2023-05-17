package in.WebDriver.Example;

//1.open google page
//2. enter any text into google textbox
//3. perform downarrow for multiple times 
//4. click on enter
//5. close browser


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

public class TC0017_PrintLinksGoogelPage {

	public static void main(String[] args) throws Exception {

		// Test steps
				//System.setProperty("webdriver.chrome.chromedriver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(options);
				
				driver.navigate().to("https://www.google.com/");
				 Thread.sleep(3000);
				 int count=driver.findElements(By.tagName("a")).size();
				 System.out.println(count);
				List<WebElement> links= driver.findElements(By.tagName("a"));
				for(WebElement li:links )
				{
					System.out.println("Link:  "+li.getText());
					System.out.println();
				}
//				      9. Close Applicatio"
						Thread.sleep(2000);
						driver.close(); 
	}

}
