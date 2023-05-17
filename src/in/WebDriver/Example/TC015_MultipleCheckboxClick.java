package in.WebDriver.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.*;

public class TC015_MultipleCheckboxClick {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		//System.setProperty("webdriver.chrome.driver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*"); //"--remote-allow-origins=*"
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://smita-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("6@@OZ1Mr@eoG");
		
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		
		 //Mouseover to PIM and click on Employee list
		 Actions ac=new Actions(driver);
			ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
			System.out.println("Mouseover on PIM done");
			
		Thread.sleep(3000);
			// Click on Add EMployee Submenu
		driver.findElement(By.linkText("Employee List")).click();
		Thread.sleep(2000);
		for (int i=1;i<10;i=i+2)
		{	
			driver.findElement(By.
					xpath("/html/body/div[1]/div[4]/div[2]/div/form/div[4]/table/tbody/tr["+i+"]/td[1]/input")).click();
			System.out.println("Clicked on Check box : " +i);
		}
		
		Thread.sleep(6000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		
		
	}

}
