package Testcases;

import org.testng.annotations.Test;

import Pages.Baseclass;
import Pages.LoginPage;

public class LoginPageTest  extends Baseclass{
	
	@Test(priority=0)
	public void Tc_001() {
	LoginPage lp=new LoginPage();
	lp.loginToApp("standard_user", "secret_sauce");
	lp.validateSuccessMessage("Products");
}
	@Test(priority=1)
	public void Tc_002() {
	LoginPage lp=new LoginPage();
	lp.loginToApp("standard_user1", "secret_sauce1");
	lp.validateErrorMessage("Epic sadface: Username and password do not match any user in this service");
}

}
