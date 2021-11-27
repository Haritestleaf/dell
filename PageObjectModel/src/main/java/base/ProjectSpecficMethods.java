package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecficMethods {

	public  ChromeDriver driver;

	@BeforeMethod
	public void preCondition() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Thread.sleep(2000);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/");
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
