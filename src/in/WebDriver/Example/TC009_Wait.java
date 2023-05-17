package in.WebDriver.Example;
//1. Launch Browser
//2. enter URL
//3. Enter username and password
//4. wait until login button need to loaded
//5. click on login button
//6.wait until page need to be loaded
//7.click on logout
//8. close pplication

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TC009_Wait {

	public static void main(String[] args) throws Exception {

		// Test steps
				//System.setProperty("webdriver.chrome.chromedriver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(options);
				
				driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				// Thread.sleep(3000);
				 
				 System.out.println(driver.getTitle());
				 driver.findElement(By.name("username")).sendKeys("Admin");
				 driver.findElement(By.name("password")).sendKeys("admin123");
				 // 4. Wait until login button button loaded =Exlicit wait
				 WebDriverWait wait= new WebDriverWait(driver, 4000);
				 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("oxd-button"))));
					 //					5.Click on Login Button
					driver.findElement(By.className("oxd-button")).click();
					//wait untill page is loaded
					driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
					System.out.println("Login cmpleted");
					
					driver.findElement(By.linkText("Logout")).click();
					Thread.sleep(2000);
					
				 //driver.findElement(By.className("oxd-userdropdown-name")).click();
						System.out.println("Logout completed");
//				      9. Close Application
					
						driver.close(); 
	}

}
