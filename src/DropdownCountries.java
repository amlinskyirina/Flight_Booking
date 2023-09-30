import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownCountries {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");//URL in the browser-(incognito) 
		// //a[@value='MAA'] --Xpath for cheenai
		
		// //a[@value='BLR']--Xpath for Bengaluru
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();//--Open Drop-down of Countries
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click(); //--Enter Bengaluru "From"
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //--Enter Cheenai added index-[2]because this is "To" 2 drop-down, but it's not stable because of to the index
		
		
		// parent child relationship Xpath
		// //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']
		
		// //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click(); // without index --> parent child
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();//date of calendar
	}
	

}
