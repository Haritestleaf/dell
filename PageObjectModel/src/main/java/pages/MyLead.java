package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecficMethods;

public class MyLead extends ProjectSpecficMethods {
	
	public MyLead (ChromeDriver driver) {
        this.driver=driver;
}
	
	
	public MyLead enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}
	
	public MyLead enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		return this;
	}
	public MyLead enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		return this;
	}
	
	public ViewLead clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLead(driver);
	}
}
