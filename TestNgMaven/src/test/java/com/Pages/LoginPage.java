package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public void LoginPage(WebDriver ldriver) {
		
		 this.driver =ldriver;
	}
	// this is my new commit to git 
	
	@FindBy(css="#agree")	 WebElement agreeButton;
	@FindBy(css="#Btn_Submit") WebElement submitBtn;
	@FindBy(css=".close-reveal-modal") WebElement closeBtn;
	@FindBy(id="txtuser") WebElement userTxt;
	@FindBy(id="txtpassword") WebElement userPswd;
	@FindBy(id="Btn_Submit") WebElement nxtSubmit;
	
	
	
	public void loginMyApp(String userName, String userPassword) {
		
		
		agreeButton.click();
		submitBtn.click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
						System.out.println(e);
		}
		closeBtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
						System.out.println(e);
		}
		userTxt.sendKeys(userName);
		userPswd.sendKeys(userPassword);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
						System.out.println(e);
		}
		nxtSubmit.click();		
		
	}
	
	

	
	

}
