import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class poopupAlert {

	public static void main(String[] args) throws InterruptedException {
		
		String text="Irina";
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(" https://rahulshettyacademy.com/AutomationPractice/"); //URL in the browser
		
		driver.findElement(By.id("name")).sendKeys(text);                 //enter in the box name=Irina
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();   //button "alert" 
		System.out.println(driver.switchTo().alert().getText());        //text message(appear) pops up:"Hello Irina, share this practice page and share your knowledge"
		Thread.sleep(2000);
		driver.switchTo().alert().accept();                            //when there is only a button "OK" or Yes-->Positive->we use the word "accept"
		driver.findElement(By.id("confirmbtn")).click();              // Click on button "Confirm"	
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());        //text message(appear) pops up:"Hello Irina, share this practice page and share your knowledge"
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();                          //when there is button "Cancel" or "No"-->Negative--> we use the word "dismiss"
	}

}
