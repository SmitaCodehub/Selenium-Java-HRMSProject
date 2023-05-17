package in.WebDriver.Example;

//TC004- Handling Frames
//1.  Login into application
//	2. click on add button
//	3. enert first name and last name
//	4.  click on save button
//	5.Click on Logout Button
//  6. Close Application
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;


public class TC004_Frames {
	static String us="txtUsername";
	static String pw="txtPassword";
	public static void main(String[] args) throws Exception {
		//Test steps
		//System.setProperty("webdriver.chrome.driver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		//1.  Login into application
		driver.navigate().to("https://smita-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
		 Thread.sleep(3000);
		 	// Enter username
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			// enter password
			driver.findElement(By.name("txtPassword")).sendKeys("6@@OZ1Mr@eoG");

		 Thread.sleep(2000);
		
		 //		  Login Button
		 driver.findElement(By.name("Submit")).click();
		 Thread.sleep(3000);
		
		 //Entering into frame
		 
		 driver.switchTo().frame("rightMenu");
		 
		 //Clicking Add button
		 driver.findElement(By.xpath(""));
			Thread.sleep(3000);
		;	
		 driver.findElement(By.name("firstName")).sendKeys("Selen");
		 driver.findElement(By.name("lastName")).sendKeys("aus");
		
		 driver.findElement(By.className("oxd-button--secondary orangehrm-left-space")).click();
			Thread.sleep(4000);
			
			
		//Logout
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Logout completed");
//		      9. Close Application
				Thread.sleep(2000);
				driver.close();
				
		 
//			6.Click on Logout Button
//	      7. Close Application


	}

}
