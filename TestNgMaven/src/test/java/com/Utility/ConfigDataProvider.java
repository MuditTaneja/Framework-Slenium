package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() {

		File src = new File("./Config/Config.Properties");

		try {
			FileInputStream fis = new FileInputStream(src);

			pro = new Properties();
			pro.load(fis);
		} catch (IOException e) {

			System.out.println("Error loading input data file");
		}
	}

	public String getDataConfig(String key) {
		return pro.getProperty(key);

	}

	public String getBrowser() {
		return pro.getProperty("Browser");

	}

	public String getURLConfig() {
		return pro.getProperty("qaURL");

	}
}
