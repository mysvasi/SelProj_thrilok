import java.io.FileInputStream;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_ApachePOI {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver119\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Code for reading data from excel sheet 
		FileInputStream fis = new FileInputStream("C:\\selenium\\test.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("login");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		if (sheet.getLastRowNum() != 0) {
			System.out.println("Test Data found");
			XSSFCell un = sheet.getRow(1).getCell(0);
			String username = un.toString(); // convert of string
			XSSFCell pwd = sheet.getRow(1).getCell(1);
			String password = pwd.toString(); //// convert of string
			System.out.println(un);
			System.out.println(pwd);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		} else {
			System.out.println("No Test Data found............");
			System.exit(0);
		}

		workbook.close();
		driver.quit();
	}

}
