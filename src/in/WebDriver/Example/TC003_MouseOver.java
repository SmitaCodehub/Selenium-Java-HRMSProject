package in.WebDriver.Example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class TC003_MouseOver {
	
	static String us="txtUsername";
	static String pw="txtPassword";
	static String title1="OrangeHRM";
	static String title2="OrangeHRM";
	

	public static void main(String[] args)  throws Exception  {
		// TODO Auto-generated method stub
		
	//	Test Steps
		//TC002
//	    1. Lanuch Browser
		//System.setProperty("webdriver.chrome.driver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
//		2. enter url
		WebDriver driver=new ChromeDriver(options);
		driver.navigate().to("https://smita-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
		
//		3. Verify title
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals(title1))
		{
			System.out.println(driver.getTitle() +" Matched");
		}
		else {
			System.out.println(driver.getTitle() +" Expected");
		}
		Thread.sleep(3000);
//		4. Enter username
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		//5. enter password
		driver.findElement(By.name("txtPassword")).sendKeys("6@@OZ1Mr@eoG");

		Thread.sleep(2000);
//		6.Click on Login Button
		driver.findElement(By.name("Submit")).click();
		//Thread.sleep(1000);
	Thread.sleep(2000);

//		7. Verify title
	// Actual result compare with Exected result
	
	if(driver.getTitle().equals(title2))
	{
		System.out.println(driver.getTitle()+" MAtched");
	}
	else {
		System.out.println(" Not MAtched");
		System.out.println(driver.getTitle()+" Expected");
	}
	Thread.sleep(2000);
//8. Mouse Over
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("Mouseover on PIM done");
		
	Thread.sleep(2000);
		// Click on Add EMployee Submenu
	driver.findElement(By.linkText("Add Employee")).click();
	Thread.sleep(2000);
//		9.Click on Logout Button
	driver.findElement(By.id("welcome")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Logout")).click();
	
	System.out.println("Logout completed");
//      9. Close Application
		Thread.sleep(4000);
		driver.close();
		
	}

}
