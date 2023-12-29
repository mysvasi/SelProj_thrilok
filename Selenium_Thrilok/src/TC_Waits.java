import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Waits {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com");
		
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) //Selenium version 3 Syntax
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//Selenium version 4 Syntax
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);//Selenium version 3 Syntax
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));//Selenium version 4 Syntax
		
		//WebDriverWait wait1 = new WebDriverWait(driver,30).until((ExpectedConditions.elementToBeClickable(contactus)));
		//Selenium version 3 Syntax
		
		
	/*	//Explicit Wait
		WebElement contactus = driver.findElement(By.xpath("//li[@id='menu-item-1561']//a[normalize-space()='Contact Us']"));
		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(30));	
		wait.until(ExpectedConditions.elementToBeClickable(contactus));
		//WebDriverWait wait1 = (WebDriverWait) new WebDriverWait(driver ,Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(contactus));
		contactus.click(); */
		
		
		//Fluent Wait - Selenium 4 syntax
		 WebElement contactus1 = driver.findElement(By.xpath("//li[@id='menu-item-1561']//a[normalize-space()='Contact Us']"));
		 Wait<WebDriver> fw = new FluentWait<>(driver)
	    .withTimeout(Duration.ofSeconds(30))
	    .pollingEvery(Duration.ofSeconds(6)) //(30*6) 5 times it will retry for element load 
	    .ignoring(Exception.class);
		 contactus1.click();
		
		

	}

}
