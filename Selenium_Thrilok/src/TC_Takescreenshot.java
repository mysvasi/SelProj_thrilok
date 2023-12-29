import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TC_Takescreenshot {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		takescreenshot( );
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// TakeScreenshot as JPG
		File f2 = new File("C:\\selenium\\screesnhot\\thrilok.jpg");
		Files.copy(f1, f2);
		// Files.copy(f1, new File("C:\\selenium\\screenshot.jpg"));

		// TakeScreenshot as PNG
		File f3 = new File("C:\\selenium\\screesnhot\\thrilok.png");
		Files.copy(f1, f3);

	}

	public static void takescreenshot( ) throws IOException {
		File f4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// TakeScreenshot as JPG
		File f5 = new File("C:\\selenium\\screesnhot\\thrilok123.jpg");
		Files.copy(f4, f5);

	}

}