package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecficMethods;

public class HomePage extends ProjectSpecficMethods {
	
	public HomePage (ChromeDriver driver) {
        this.driver=driver;
}
	
	public MyHomePage clickOnCRM() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}

}
