

	
//TC001
//	    1. Lanuch Browser	
//		2. enter url
//		2. Enter username
//		4. Enter Password
//		5.Click on Login Button
//		6.Click on Logout Button
//      7. Close Application
package in.WebDriver.Example;
//To get access webdriver classes and methods
import org.openqa.selenium.WebDriver;
//To get access for firefox browser
//import org.openqa.selenium.firefox.*;
//To get access for chrome browser
import org.openqa.selenium.chrome.*;



//To get access for object identification methods
import org.openqa.selenium.By;

public class TC001_LoginLogout {
	public static void main(String[] args) throws InterruptedException
	{
		
//	    1. Lanuch Browser	
//		The setProperty method has two attributes – “propertyName” and “value.” The propertyName 
//		represents the name of the browser-specific driver, and the value points to the path of that browser 
//		/.
		//System.setProperty("webdriver.chrome.driver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
//		We create a reference variable for WebDriver interface and instantiate it using ChromeDriver class. A 
//		default ChormeDriver profile will be launched which means that no extensions and plugins would be 
//		loaded with the ChromeDriver instance and that it runs in the safe mode
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
//		2. enter url
		driver.navigate().to("https://smita-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("6@@OZ1Mr@eoG");
	
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		
		
		
		driver.close();

	}

}
