import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FindElements1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/ajax.html");
		Thread.sleep(2000);
		//number of anchor tag will read it from website <a>
		List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println("Number of links:"+ list.size());
        for(WebElement link : list )
        {       	
        	System.out.print(link.getText()+"\n" );
        }
        
        driver.quit();
	}
	

}
