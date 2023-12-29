import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='w3-clear nextprev']//a[@class='w3-right w3-btn'][contains(text(),'Next ❯')]")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().to("https://www.google.com");
		driver.quit();
	}

}
