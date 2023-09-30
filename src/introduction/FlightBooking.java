package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FlightBooking {
    // let's try to push
	public static void main(String[] args) throws InterruptedException {
		// FROM OPTION -delcxvghjklhi -->DEL
		// TO OPTION-CHENNAI--> MAA
		// DATE OF CALENAR 1-SELECT (CURRENT DAY)
		// NO RETURN DAY DISABLE//
		// PASSANGERS- 5 ADULTS
		// SEARCH-BUTTON CLICK
		// CHECK BOX FAMILY AND FRIENDS
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");// URL in the browser

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")); // button --one way
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();// --Open Drop-down of Countries
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='DEL']")).click(); // --Enter DELI "From"
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click(); // TO OPTION-CHENNAI--> MAA
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();// date of calendar

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) // pri najatii radio button est
																						// enable i disenable of date
																						// polzuemsya if
		{
			System.out.println("its disabled");
			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);
		}

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); // Checkbox
		driver.findElement(By.id("divpaxinfo")).click(); // THE BUTTON -dropdown-->open to passengers list
		Thread.sleep(2000L);
		// PASSANGERS
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click(); // press the button DONE
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // לסגור LOOLAA
		Thread.sleep(2000L);
		// SEARCH BUTTON --XPATH/CSS/ID/value
		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();//id=#
		driver.findElement(By.cssSelector("input[value='Search']")).click();// css--value--this is the best of all
		// driver.findElement(By.xpath("//input[@value='Search']")).click(); //xpath
		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		// //name

	}

}
