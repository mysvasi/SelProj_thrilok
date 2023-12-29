import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.id("input")).sendKeys("Selenium");	
		WebElement p = driver.findElement(By.name("q"));
	    p.sendKeys("Selenium");
		Thread.sleep(40);
	    p.submit();
		
		
	}

}
