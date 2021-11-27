package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecficMethods;

public class ViewLead extends ProjectSpecficMethods {

	public ViewLead (ChromeDriver driver) {
        this.driver=driver;
}
	
	public ViewLead verify() {
		boolean displayed = driver.findElement(By.xpath("//div[text()=\"View Lead\"]")).isDisplayed();
		Assert.assertTrue(displayed);

//		if (displayed ) {
//			System.out.println("verified");
//		}
		return this;
	}
}
