import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);

		// Row Count Details
		int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		int celldata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td")).size();
		System.out.println(row);
		System.out.println(celldata);
		
		// To get Data from particular Cell
		String data1 = driver.findElement(By.xpath("//table [@id='customers']/tbody/tr[3]/td[3]")).getText();
		System.out.println(data1);
		
		for (int i = 1; i <= row; i++) {
			String Alldata = driver.findElement(By.xpath("//table [@id='customers']/tbody/tr[" + i + "]")).getText();
			System.out.println(Alldata);
			System.out.println();
		} 
		
		for (int i = 3; i <= row; i++) {
			String country = driver.findElement(By.xpath("//table [@id='customers']/tbody/tr/td[" + i + "]")).getText();
			System.out.println(country);
			System.out.println();
		}
		
		driver.quit();
	}

}
