import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropDownCheckbox {
		
	//Drop-Down
	//Checkbooks----> "input[id*='SeniorCitizenDiscount']"--zvezdochka kogda berem chast iz id*=
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");//URL in the browser-(incognito) 
		
		//Checkbox
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); //Checkbox
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//Count the number of Checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());   // all the elements in the page so size 
		driver.findElement(By.id("divpaxinfo")).click();   //THE BUTTON -dropdown-->open to passengers list 
			Thread.sleep(2000L);
			/*int i=1;
			while(i<5)
			{
				driver.findElement(By.id("hrefIncAdt")).click();  // 4 times (2 adults) ->  add passengers using the plus button
				i++;
			
			}*/
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());   // Before for :THE BUTTON -dropdown-->open to passengers list 		
for (int i=1;i<5;i++)
	{
	driver.findElement(By.id("hrefIncAdt")).click();
	
	}
		
				driver.findElement(By.id("btnclosepaxoption")).click();   //press the button DONE
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());  //לסגור LOOLAA
	}

}
