

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name="irina";
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		
		driver.get("https:/www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);// sterli slovo -rahulshettyacademy
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());  // message:You are successfully logged in
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");//get text:Hello irina
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();  //button log out
		driver.close();  //close page
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https:/www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();    //reset login-click and see to text  ||
		String passwordText=driver.findElement(By.cssSelector("form p")).getText();   //parent-child-->message:Please use temporary password 'rahulshettyacademy' to Login.
		// Please use temporary password 'rahulshettyacademy' to Login.
		
		String [] passwordArray= passwordText.split("'");  //разделить регулярное выражение
	
		//	String [] passwordArray2=passwordArray[1].split("'");
		//	passwordArray2[0]
		String password = passwordArray[1].split("'")[0];
		return password;
		
		//0th index-Please use temporary password
		//1st index- rahulshettyacademy'to Login.
		
		//0th index- rahulshettyacademy'
		//1st index- to login.
		
	}
	
	

}
