package com.vandvtechsoln.hybridframe_team_b.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "uid")
	WebElement txt_userid;

	@FindBy(name = "password")
	WebElement txt_password;

	@FindBy(name = "btnLogin")
	WebElement loginbtn;

	public void setUsername(String uname) {
		txt_userid.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}

	public void clickOnLoginBtn() {
		loginbtn.click();
	}
}

