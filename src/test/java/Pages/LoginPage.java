package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseclass{
@FindBy(id="user-name")
WebElement username;
@FindBy(id="password")
WebElement password;
@FindBy(id="login-button")
WebElement Btn;

public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	public void loginToApp(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		Btn.click();
	}
	public void validateSuccessMessage(String string) {
		// TODO Auto-generated method stub
		
	}
	public void validateErrorMessage(String string) {
		// TODO Auto-generated method stub
		
	}

}
