package testCase;

import org.testng.annotations.Test;

import base.ProjectSpecficMethods;
import pages.LoginPage;

public class verifyCreateLead extends ProjectSpecficMethods {

	@Test
	public void runCreateLead() {

		new LoginPage(driver).enterUsername().enterPassword().clickLoginButton().clickOnCRM().clickOnLead()
				.clickOnCreatelead().enterCompanyName().enterFirstName().enterLastName().clickSubmit().verify();

	}

}
