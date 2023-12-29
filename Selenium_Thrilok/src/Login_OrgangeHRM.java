import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_OrgangeHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
        String title = driver.getTitle();
        System.out.println("LoginPage title :" + title);   
        WebElement email = driver.findElement(By.name("username"));
        email.clear();
        email.sendKeys("admin@yourstore.com");
        WebElement  password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("admin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String Hometitle = driver.getTitle();
        System.out.println("HomePage title :" + Hometitle); 
        driver.close();

	}

}
