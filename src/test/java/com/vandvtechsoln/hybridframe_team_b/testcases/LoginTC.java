package com.vandvtechsoln.hybridframe_team_b.testcases;

import org.testng.annotations.Test;

import com.vandvtechsoln.hybridframe_team_b.pageobjects.LoginPage;
import com.vandvtechsoln.hybridframe_team_b.testbase.TestBase;

public class LoginTC extends TestBase {

	@Test

	public void loginToGuru99() throws InterruptedException {

		System.out.println("loginToGuru99 Test Case");

		LoginPage lp = new LoginPage(driver);
		lp.setUsername("mngr341390");
		lp.setPassword("vYmajuh");
		lp.clickOnLoginBtn();

		Thread.sleep(5000);

		String hpTitle = driver.getTitle();
		Thread.sleep(5000);

		System.out.println(hpTitle);
		driver.quit();

	}
}