package hw13Selenium;
import org.openqa.selenium.By;
/* Also use maximize(), fullscreen(), deleteAllCookies(), get (), sleep(), click(), quit() methods for your chosen URL. You can also choose more than one url to see those actions. Please push it to github*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_get_method {
	
	WebDriver driver;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\HomeWorkOctober2021\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void books() throws InterruptedException {
	driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_books']")).click();
		driver.manage().window().fullscreen();
		Thread.sleep(10000);
	}

@AfterTest
public void tearUp() {
	driver.quit();
}
}







