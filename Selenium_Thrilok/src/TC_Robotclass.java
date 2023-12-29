import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Robotclass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robo.mousePress(InputEvent.BUTTON3_DOWN_MASK);

	}

}
