import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//TestNG is one of the testing framework 

public class TestNGUpdateDropDownCheckbox2 {

	// Drop-Down
	// Checkbooks----> "input[id*='SeniorCitizenDiscount']"--zvezdochka kogda berem
	// chast iz id*=

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");// URL in the browser-(incognito)

		// Checkbox

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); // Checkbox
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());// SELENIUM
																													// CHECK
																													// BOX
																													// SELECT

		// .ui-state-default.ui-state-highlight- CALENDAR

		// System.out.println(driver.findElement(By.cssSelector("ctl00$mainContent$view_date2")).isEnabled());//
		// vklyuchena videmost na kalendare
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); // button of radio--> Round Trip
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains(" 1")) // pri najatii radio button est
																					// enable i disenable of date
																					// polzuemsya if
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);
		}

		// Count the number of Checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); // all the elements in
																									// the page so size
		driver.findElement(By.id("divpaxinfo")).click(); // THE BUTTON -dropdown-->open to passengers list
		Thread.sleep(2000L);
		/*
		 * int i=1; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); // 4
		 * times (2 adults) -> add passengers using the plus button i++;
		 * 
		 * }
		 */
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // Before for :THE BUTTON
																				// -dropdown-->open to passengers list
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click(); // press the button DONE
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // לסגור LOOLAA
	}

}
