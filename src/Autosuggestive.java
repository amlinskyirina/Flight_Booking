import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// entering three letters into the search ind-->India
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");  // entering three letters into the search ind-->India
		Thread.sleep(3000);
	    List<WebElement>options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));// li->parent,a-> child
		
	    
	    //kogda est' spisok gorodov pishem for --> if-- i vvodim nujnii gorod
	    
	    for(WebElement option:options)
	    {
	    	if (option.getText().equalsIgnoreCase("India"))
	    	{
	    	    option.click();
	        	break;
	    	}
	    		
	    }
	    
	    
		
	}

}
