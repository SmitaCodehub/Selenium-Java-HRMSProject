package in.WebDriver.Example;
//1. login into application
//2.select employee ID option from search By dropdown
//3. enter employee id in search for text box
//4. click on search botton
//5.click on check Box
//6.click on Delete Button
//7. click on logout
//8.close application




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class TC008_DropDown {

	public static void main(String[] args) throws Exception {

		// Test steps
				//System.setProperty("webdriver.chrome.chromedriver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(options);
				
				driver.navigate().to("https://smita-osondemand.orangehrm.com/symfony/web/index.php/auth/login");				 Thread.sleep(3000);
				 Thread.sleep(3000);
				 System.out.println(driver.getTitle());
				 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
					//. enter password
					driver.findElement(By.name("txtPassword")).sendKeys("6@@OZ1Mr@eoG");

				 driver.findElement(By.name("Submit")).click();
				
				 Thread.sleep(3000);
				 // Enter into frame
				// driver.switchTo().frame("rightMenu");
				 
				 //Mouseover to PIM and click on Employee list
				 Actions ac=new Actions(driver);
					ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
					System.out.println("Mouseover on PIM done");
					
				Thread.sleep(2000);
					// Click on Add EMployee Submenu
				driver.findElement(By.linkText("Employee List")).click();
				Thread.sleep(2000);
				 
				 // Select value from search by dropdown
				
				 Select st=new Select(driver.findElement(By.name("empsearch[termination]")));
				 Thread.sleep(3000);
				 st.selectByVisibleText("Current and Past Employees");
				// st.selectByIndex(2);
				// st.selectByValue("1");
				 driver.findElement(By.name("empsearch[id]")).sendKeys("0004");
				 
				 driver.findElement(By.id("searchBtn")).click();
				 
				 
				
				
				 Thread.sleep(3000);	 
				 
				 driver.findElement(By.name("chkSelectRow[]")).click();
				 Thread.sleep(3000);
				 driver.findElement(By.name("btnDelete")).click();
				 
				 Thread.sleep(3000);
				// driver.switchTo().defaultContent();
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
