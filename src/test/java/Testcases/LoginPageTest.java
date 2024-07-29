package Testcases;

import org.testng.annotations.Test;

import Pages.Baseclass;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginPageTest extends Baseclass {

	@Test(priority = 0)
	public void Tc_001() {
		LoginPage lp = new LoginPage();
		lp.loginToApp("standard_user", "secret_sauce");
		lp.validateSuccessMessage("Products");
	}

	@Test(priority = 1)
	public void Tc_002() {
		LoginPage lp1 = new LoginPage();
		lp1.loginToApp("standard_user1", "secret_sauce1");
		lp1.validateErrorMessage("Epic sadface: Username and password do not match any user in this service");
	}

	@Test(priority = 2)
	public void Tc_003() {
		LoginPage lp2 = new LoginPage();
		lp2.loginToApp("locked_out_user", "secret_sauce");
		lp2.validateLoggedMessage("Epic sadface: Sorry, this user has been locked out.");
	}
}
