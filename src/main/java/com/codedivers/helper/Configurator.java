package com.codedivers.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configurator {

	String browser;
	WebDriver driver;

	private static Configurator instance = null;

	private Configurator() {
	}

	public static Configurator getInstance() {
		if (instance == null) {
			instance = new Configurator();
		}
		return instance;
	}

	public WebDriver getDriver() {

		browser.toLowerCase();

		if (browser.contains("chrome") || browser.equalsIgnoreCase("gc")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			return new ChromeDriver();
		} else if (browser.contains("firefox") || browser.contains("ff")) {

		} else if (browser.contains("internet") || browser.contains("ie")) {

		} else if (browser.contains("safari")) {

		} else if (browser.contains("edge")) {

		} else if (browser.contains("opera")) {

		} else if (browser.contains("phantom")) {

		} else if (browser.contains("html")) {

		} else {

		}
		return driver;
	}

	public void setBrowser(String browser) {
		if (!browser.equals("") && !browser.equals(null)) {
			this.browser = browser;
		} else {
			throw new IllegalArgumentException("No Browser mentioned!");
		}
	}

}
