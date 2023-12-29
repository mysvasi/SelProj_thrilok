import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_Mouseover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"));
        Actions ac = new Actions(driver);
        ac.moveToElement(ele).perform(); //Mouse Hover on FreeBooks Menu
        driver.findElement(By.xpath("//span[normalize-space()='Free Machine Learning Ebooks']")).click();
        Thread.sleep(2000);
        
	}

}
