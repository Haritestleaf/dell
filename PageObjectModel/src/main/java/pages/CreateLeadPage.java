package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecficMethods;

public class CreateLeadPage extends ProjectSpecficMethods {
	public CreateLeadPage (ChromeDriver driver) {
        this.driver=driver;
}
	
	public MyLead clickOnCreatelead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new MyLead(driver);
}
}