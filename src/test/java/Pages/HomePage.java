package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends Baseclass {
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	WebElement Productbag;
	@FindBy(xpath = "//button[text()='ADD TO CART']")
	WebElement AddCart;
	@FindBy(xpath = "//div[@id='shopping_cart_container']")
	WebElement MinCart;
	@FindBy(xpath = "//a[text()='CHECKOUT']")
	WebElement CheckOut;
	@FindBy(xpath = "//input[@id='first-name']")
	WebElement FirstName;
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement LastName;
	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement PostalCode;
	@FindBy(xpath = "//input[@value='CONTINUE']")
	WebElement ContinueBtn;
	@FindBy(xpath = "//a[text()='FINISH']")
	WebElement FinishBtn;
	@FindBy(xpath = "//h2[text()='THANK YOU FOR YOUR ORDER']")
	WebElement SuccessOrder;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void AddCart() throws Exception {
		Thread.sleep(4000);
		Productbag.click();
		AddCart.click();
		MinCart.click();
		CheckOut.click();
		FirstName.sendKeys("lakshmikanth");
		LastName.sendKeys("reddy");
		PostalCode.sendKeys("500072");
		ContinueBtn.click();
		FinishBtn.click();

	}

	public void validateSuccessOrder(String ExceptSuccess) {
		// TODO Auto-generated method stub
		String ActualMessage = SuccessOrder.getText();
		Assert.assertEquals(ActualMessage, ExceptSuccess);
	}

}
