import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https:/www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("irina");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@placeholder='Name']")).sendKeys("John");  // or  input or *
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsi.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3 )")).sendKeys("john@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("053333333");
		//driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("053333333");  
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("053333333");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();    //reset login
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());   //parent-child-->message:Please use temporary password 'rahulshettyacademy' to Login.
		//driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();   //parent -> child---> button go to login
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("irina");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();  //forgot your password-variant div-->contains
		
		
	}

}
