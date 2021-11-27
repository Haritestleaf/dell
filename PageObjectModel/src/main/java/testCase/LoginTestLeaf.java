package testCase;

import org.testng.annotations.Test;

import base.ProjectSpecficMethods;
import pages.LoginPage;

public class LoginTestLeaf extends ProjectSpecficMethods {

	@Test
	public void loginTestLeaf() {

		new LoginPage(driver).enterUsername().enterPassword().clickLoginButton().clickOnCRM();
}
}