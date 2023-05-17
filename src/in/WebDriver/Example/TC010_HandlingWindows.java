package in.WebDriver.Example;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.By;

	public class TC010_HandlingWindows {

		public static void main(String[] args) throws Exception {
		
			// Test steps
			//System.setProperty("webdriver.chrome.chromedriver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			
			driver.navigate().to("http://localhost:5500/tableandList.html");	
			Thread.sleep(2000);
			
			
			
	      
	        driver.close();  //to close one window
	        //driver.quit(); //to close all window
		}

	}


	