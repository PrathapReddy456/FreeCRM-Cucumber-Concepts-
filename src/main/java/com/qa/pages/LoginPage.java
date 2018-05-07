package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utill.TestBase;

public class LoginPage extends TestBase {

	// Page Factory - OR

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginbtn;

	@FindBy(xpath = "//*[@id=\'navbar-collapse\']/ul/li[2]/a")
	WebElement SignUpBtn;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/a/img")
	WebElement crmLogo;

	// Initializing the page Objects:

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}

	public HomePage login(String un, String pwsd) {

		username.sendKeys(un);
		password.sendKeys(pwsd);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginbtn);

		return new HomePage();
	}

}
