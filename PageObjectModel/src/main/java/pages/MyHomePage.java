package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecficMethods;

public class MyHomePage extends ProjectSpecficMethods{
	
	public MyHomePage (ChromeDriver driver) {
        this.driver=driver;
}
	
	public CreateLeadPage clickOnLead() {
		driver.findElement(By.linkText("Leads")).click();
		return new CreateLeadPage(driver);
	}

}
