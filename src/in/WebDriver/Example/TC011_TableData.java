package in.WebDriver.Example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class TC011_TableData {

	public static void main(String[] args) throws Exception {
	
		// Test steps
		//System.setProperty("webdriver.chrome.chromedriver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.navigate().to("http://localhost:5500/tableandList.html");	
		Thread.sleep(2000);
		// Count detals...size()
        int row=driver.findElements(By.xpath("/html/body/table[1]/tbody/tr")).size();
        
        System.out.println(row);
        int col= driver.findElements(By.xpath("/html/body/table[1]/tbody/tr[1]/td")).size();
        System.out.println(row);
        int row_col= driver.findElements(By.xpath("/html/body/table[1]/tbody/tr/td")).size();
        System.out.println(row_col);
        
        // Data... Cell
        
        String cell=driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[2]")).getText();
        Thread.sleep(2000);
        System.out.println(cell);
        // Data... Table
        for(int i=0;i<row;i++)
        {
            String data=driver.findElement(By.xpath("/html/body/table[1]/tbody/tr["+i+"]")).getText();       		
            		
    
            Thread.sleep(2000);
        System.out.println(data);
    
        }
        driver.close();
	}

}
