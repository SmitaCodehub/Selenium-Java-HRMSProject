package in.WebDriver.Example;
// working with alerts

// 1. enter user name
//2. login without typing password
//
// 4.retriev text from alert
// 5. clik on ok button on alert
// 6. enter password
//
// 8.click on logout
// 9 close application
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
 import org.openqa.selenium.Alert;
 
public class TC005_Alert_Popup {

	public static void main(String[] args) throws Exception{
		
		// Test steps
		//System.setProperty("webdriver.chrome.chromedriver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.navigate().to("https://smita-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
		

		Thread.sleep(3000);
//		4. Enter username
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		Thread.sleep(2000);
//		6.Click on Login Button
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());	
		al.accept();//to press ok on popup window
		//al.dismiss();//to press 'cancel' on popup window
		Thread.sleep(2000); 
		//5. enter password
		driver.findElement(By.name("txtPassword")).sendKeys("6@@OZ1Mr@eoG");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();

	Thread.sleep(2000); 
		
		  Thread.sleep(3000);
		 	
			
			//Logout
		  driver.findElement(By.id("welcome")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Logout")).click();
			
			System.out.println("Logout completed");
//		      9. Close Application
				Thread.sleep(2000);
				driver.close();
		 
		 
	}

}
