package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends Baseclass {

	@FindBy(id = "user-name")
	WebElement username;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(id = "login-button")
	WebElement Btn;
	@FindBy(xpath = "//div[text()='Products']")
	WebElement SuccessMessage;
	@FindBy(xpath = "//h3[@data-test='error']")
	WebElement ErrorMessage;
	@FindBy(xpath = "//h3[@data-test='error']")
	WebElement LogoutUser;
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	WebElement ProductBag;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void loginToApp(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		Btn.click();
	}

	public void validateSuccessMessage(String ExceptSuccess) {
		// TODO Auto-generated method stub
		String ActualMessage = SuccessMessage.getText();
		Assert.assertEquals(ActualMessage, ExceptSuccess);
	}

	public void validateErrorMessage(String ExpectedError) {
		// TODO Auto-generated method stub
		String ActualMessage = ErrorMessage.getText();
		Assert.assertEquals(ActualMessage, ExpectedError);

	}

	public void validateLoggedMessage(String LogErrorMessage) {
		// TODO Auto-generated method stub
		String ActualMessage = LogoutUser.getText();
		Assert.assertEquals(ActualMessage, LogErrorMessage);
	}

}
