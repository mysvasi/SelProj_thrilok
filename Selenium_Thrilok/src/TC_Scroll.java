import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class TC_Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://phptravels.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.xpath("//strong[normalize-space()='Pricing & Aggregation']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		
		//scroll down to the bottom of the webpage
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//scroll down on a web page  by defining the number of pixels
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,350)", ""); //;To Scorll down
		//js2.executeScript("window.scrollBy(0,-600)", ""); //To Scorll Up  
			
		//Scrolling using Actions Class
		/* Actions ac =  new Actions(driver);
		//Scroll to element
		//ac.scrollToElement(element).perform();
		
		//Scroll by given amount
		//int deltaY = element.getRect().y;
		//ac.scrollByAmount(0, deltaY).perform();
		
		//Scroll from an element by a given amount
		 WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(element, 0, -50);
         ac.scrollFromOrigin(scrollOrigin, 0, 600).perform();
         
         //Scroll from a offset of origin (element) by given amount 
         WheelInput.ScrollOrigin scrollOrigin1 = WheelInput.ScrollOrigin.fromViewport(10, 10);
         ac.scrollFromOrigin(scrollOrigin1, 0, 200).perform(); */
	}

}
