package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Baseclass;
import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTest extends Baseclass {
	LoginPage lp;
	HomePage ip3;

	@Test

	public void Tc_001() throws Exception {
		lp = new LoginPage();
		lp.loginToApp("standard_user", "secret_sauce");
		lp.validateSuccessMessage("Products");
		ip3 = new HomePage();
		ip3.AddCart();
		ip3.validateSuccessOrder("THANK YOU FOR YOUR ORDER");

	}
}
