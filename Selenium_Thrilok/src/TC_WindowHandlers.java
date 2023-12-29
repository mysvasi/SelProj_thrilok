import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WindowHandlers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.linkText("Visit W3Schools.com!")).click();	
		String handle = driver.getWindowHandle(); //to get the single tab 
		System.out.println("Current Window Handle: " + handle + "\n");
		//It holds the number windowhandles
		ArrayList<String> handles = new ArrayList<String>(driver.getWindowHandles());//to get the multiple tab 
		System.out.println("No. of tabs "+ handles.size());
		driver.switchTo().window(handles.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		//driver.close();
		//Switch back to the old tab or window
		driver.switchTo().window(handle);
		String Orgtitle = driver.getTitle();
		System.out.println(Orgtitle);
	}

}
