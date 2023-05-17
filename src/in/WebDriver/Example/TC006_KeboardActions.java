package in.WebDriver.Example;
//open application
//enter username
//enter password
//press on tab key from kkeybord
//press on ENTER key from keyboard



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TC006_KeboardActions {

	public static void main(String[] args) throws Exception {

		// Test steps
				//System.setProperty("webdriver.chrome.chromedriver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(options);
				
				driver.navigate().to("https://smita-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
				 Thread.sleep(3000);
				 
				 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
				 
				driver.findElement(By.name("txtPassword")).sendKeys("6@@OZ1Mr@eoG");
				Thread.sleep(1000);
				 //Click on login button-keyoard by 1. TAB 2. ENTER
				 Robot r=new Robot();
				 r.keyPress(KeyEvent.VK_TAB);
				 r.keyRelease(KeyEvent.VK_TAB);
				 System.out.println("TAB");
				 
				 Thread.sleep(2000);
				 r.keyPress(KeyEvent.VK_ENTER);
				 r.keyPress(KeyEvent.VK_ENTER);
				 System.out.println("ENTER");
				 
				 Thread.sleep(3000);
					//Logout
				 driver.findElement(By.id("welcome")).click();
					Thread.sleep(1000);
					driver.findElement(By.linkText("Logout")).click();
					System.out.println("Logout completed");
//				      9. Close Application
						Thread.sleep(2000);
						driver.close(); 
	}

}
