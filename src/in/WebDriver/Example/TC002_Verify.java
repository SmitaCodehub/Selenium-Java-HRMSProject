package in.WebDriver.Example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;

public class TC002_Verify {
	
	static String us="txtUsername";
	static String pw="txtPassword";
	static String title1="OrangeHRM";
	static String title2="OrangeHRM";
	//static String us=;
	

	public static void main(String[] args)  throws Exception  {
		// TODO Auto-generated method stub
		
	//	Test Steps
		//TC002
//	    1. Lanuch Browser
	//System.setProperty("webdriver.chrome.driver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		
//		We create a reference variable for WebDriver interface and instantiate it using ChromeDriver class. A 
//		default ChormeDriver profile will be launched which means that no extensions and plugins would be 
//		loaded with the ChromeDriver instance and that it runs in the safe mode
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		2. enter url
		driver.navigate().to("https://smita-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
		
		
//		3. Verify title

		Thread.sleep(2000);
	System.out.println(driver.getTitle());
	if(driver.getTitle().equals(title1))
	{
		System.out.println(driver.getTitle() +" Matched");
	}
	else {
		System.out.println(driver.getTitle() +" Expected");
	}
	Thread.sleep(2000);
	//4. enter username
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	//5. enter password
	driver.findElement(By.name("txtPassword")).sendKeys("6@@OZ1Mr@eoG");

//		6.Click on Login Button
	
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(1000);
	
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
	
	Thread.sleep(3000);
	//8.click on logout
	driver.findElement(By.id("welcome")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Logout")).click();
	

	
	Thread.sleep(2000);

	System.out.println("Logout completed");
//      9. Close Application
	
		driver.close();
		
	}

}
