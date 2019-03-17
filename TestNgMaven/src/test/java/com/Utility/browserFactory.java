package com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserFactory {

	public static WebDriver startApp(WebDriver driver, String browName, String AppURL) {
		if (browName.equals("chrome")) {

			driver = new ChromeDriver();
			
		}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get(AppURL);
		
		
		return driver;

	}

	public static void closeBrowser(WebDriver driver) {
		driver.quit();

	}

}
