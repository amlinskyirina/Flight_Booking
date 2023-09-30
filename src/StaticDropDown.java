import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");
		//dropdown with select tag
		
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown =new Select(staticDropDown);
		dropdown.selectByIndex(3);// of index ,there are 4 options in the select element :0,1,2,3->3=USA
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");// of text
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");//of value
		System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
