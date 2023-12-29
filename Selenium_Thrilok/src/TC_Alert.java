import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // to delete the cookies - browser history 
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);// it will pause the execution for 20 seconds
		driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		WebElement ar = driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]"));
		ar.click();
		ar.clear();
		Thread.sleep(2000);
		a.sendKeys("Alert Demo Test");
		Thread.sleep(3000);
		//a.accept();

}
}