package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
//import com.beust.jcommander.Parameters;

public class TC_ParallelTest {

	static WebDriver driver;

	@Test
	public void openFF() throws Exception {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		Reporter.log("Opened HRMS application in Firefox Browser");
		Thread.sleep(5000);
	}

	@Parameters({ "browser" })
	@BeforeMethod
	public void setUp(String browser) {
		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
    @AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
