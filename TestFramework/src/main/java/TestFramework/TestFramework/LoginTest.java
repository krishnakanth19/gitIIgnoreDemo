package TestFramework.TestFramework;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test
	public void loginIntoApp() {
		LoginPage lp = new LoginPage(driver);
		lp.launchApp();
		lp.loginToGmail();
	}
}
