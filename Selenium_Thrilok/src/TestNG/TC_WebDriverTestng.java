package TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_WebDriverTestng extends Takescreenshot {
	
	private WebDriver driver;
	
	@BeforeClass
	public void Startup() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
		driver = new ChromeDriver();	
	}
	
	@Test(description="OrangeHRM Login")
	public void Login() throws InterruptedException, IOException {
		Reporter.log("Test Case Steps started");
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
        String title = driver.getTitle();
        System.out.println("LoginPage title :" + title);
        takescreenshot(driver);
        WebElement email = driver.findElement(By.name("username"));
        email.clear();
        email.sendKeys("Admin");
        WebElement  password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        takescreenshot(driver); 
        String Hometitle = driver.getTitle();
        System.out.println("HomePage title :" + Hometitle); 	
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
