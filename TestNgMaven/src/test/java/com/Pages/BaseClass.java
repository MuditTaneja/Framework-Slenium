package com.Pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.Utility.ConfigDataProvider;
import com.Utility.browserFactory;
import com.Utility.excelDataProvider;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass extends browserFactory {

	// Declared the reference variable here GLOBALLY

	public WebDriver driver;
	public excelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;

	@BeforeSuite
	public void setUpSuite() {

		Reporter.log("inside the base class running before suite", true);
		// setting up excel
		excel = new excelDataProvider();

		config = new ConfigDataProvider();

		ExtentHtmlReporter extent = new ExtentHtmlReporter(
				new File(System.getProperty("user.dir") + "/Reports/SMVD.html"));
		report = new ExtentReports();
		report.attachReporter(extent);
	}

	@BeforeClass
	public void setUp() {

		Reporter.log("inside the base class running before class", true);

		driver = browserFactory.startApp(driver, config.getBrowser(), config.getURLConfig());

		Reporter.log("inside the base class >> calling login fun from browser factory", true);

	}

	@AfterClass
	public void tearDown() {

		Reporter.log("inside the base class >> after class>> closing browser", true);

		browserFactory.closeBrowser(driver);
	}

	@AfterMethod
	public void flushReoprts() {
		Reporter.log("inside the base class >> after method >> flushing report ", true);
		report.flush();
	}

}
