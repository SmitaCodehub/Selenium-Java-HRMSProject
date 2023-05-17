package in.WebDriver.Example;

//1.open google page
//2. enter any text into google textbox
//3. perform downarrow for multiple times 
//4. click on enter
//5. close browser


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TC007_KeyboardAct_webDriver {

	public static void main(String[] args) throws Exception {

		// Test steps
				//System.setProperty("webdriver.chrome.chromedriver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(options);
				
				driver.navigate().to("https://www.google.com/");
				 Thread.sleep(3000);
				 driver.findElement(By.name("q")).sendKeys("selenium");
				 Thread.sleep(3000);
				 //  keyboard activities selenium webdriver class Keys
				 driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
				 Thread.sleep(3000);
				 driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
				 Thread.sleep(3000);
				 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
				 
				 
				
//				      9. Close Application
						Thread.sleep(2000);
						driver.close(); 
	}

}
