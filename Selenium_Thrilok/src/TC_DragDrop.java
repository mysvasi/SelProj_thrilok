import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		driver.switchTo().frame(0);//iframe using switchTo method
		WebElement source = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		ac.dragAndDrop(source, target).perform();
		//ac.dragAndDropBy(source, 150, 30).perform();
			
	}

}
