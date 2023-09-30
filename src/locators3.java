import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Sibling - Child to parent traverse
		
		//header/div/button[1]/following-sibling::button[1]
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText()); // button login -> parent-child
		
		//button -Practice -> //header/div/button[1]
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]")).getText()); // button login -> parent-child
				
		
	}

}
