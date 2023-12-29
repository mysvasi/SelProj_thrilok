import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerfiyTitle {

	public static void main(String[] args) throws InterruptedException {
		String Email = "admin@yourstore.com";
		String pwd ="admin";
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//getTitle()— Pre-defined method in selenium to retrieve Current Page Title
		//equals() - its Java Pre-Defined method to compare expected result and actual result
		if(driver.getTitle().equals("Your store. Login"))
		{
			System.out.println("Title Matched");
		}
		else
		{
			System.out.println("Title not matched and expected title is "+ driver.getTitle());
		}	  
        WebElement email = driver.findElement(By.name("Email"));
        email.clear();
        email.sendKeys("admin@yourstore.com");
        WebElement  password = driver.findElement(By.name("Password"));
        password.clear();
        password.sendKeys("admin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String Hometitle = driver.getTitle();
        System.out.println("HomePage title :" + Hometitle); 
        driver.close();
	}

}
