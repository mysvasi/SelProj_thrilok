package TestNG;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Takescreenshot {

	public static void takescreenshot(WebDriver driver) throws IOException {
		
		File f4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// TakeScreenshot as JPG
		File f5 = new File("C:\\selenium\\screesnhot\\thrilok123.jpg");
		Files.copy(f4, f5);

	}

}
