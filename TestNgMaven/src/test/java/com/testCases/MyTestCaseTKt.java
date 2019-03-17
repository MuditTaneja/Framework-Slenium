package com.testCases;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.Pages.BaseClass;
import com.Pages.LoginPage;
import com.Utility.excelDataProvider;

public class MyTestCaseTKt extends BaseClass {

	@Test
	public void loginAppication() {

		logger = report.createTest("MyTestCaseTKt");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Login into the SMVD");

		loginPage.loginMyApp(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		logger.pass("Login Done Successfully");

	}

}
