package com.codedivers.testing.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumKeywords {

	WebDriver driver;

	public SeleniumKeywords(WebDriver driver) {
		this.driver = driver;
	}

	public void launch(String url) {
		driver.get(url);
	}

	public void click(String locator, String locatorValue) {
		driver.findElement(getLocator(locator, locatorValue)).click();
	}

	public void enter(String locator, String locatorValue, String data) {
		driver.findElement(getLocator(locator, locatorValue)).sendKeys(data);
	}

	public void select(String locator, String locatorValue, String data) {
		WebElement element = driver.findElement(getLocator(locator, locatorValue));
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	public void waitInSeconds(String data) {
		try {
			Thread.sleep(Integer.valueOf(data) * 1000);
		} catch (NumberFormatException e) {
			System.out.println("Wrong wait time format.");
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public By getLocator(String locator, String locatorValue) {
		locator.toLowerCase();
		if (locator.equals("id")) {
			return By.id(locatorValue);
		} else if (locator.equals("classname")) {
			return By.className(locatorValue);
		} else if (locator.equals("name")) {
			return By.name(locatorValue);
		} else if (locator.equals("xpath")) {
			return By.xpath(locatorValue);
		} else if (locator.equals("cssselector")) {
			return By.cssSelector(locatorValue);
		} else if (locator.equals("partiallinktext")) {
			return By.partialLinkText(locatorValue);
		} else if (locator.equals("linktext")) {
			return By.linkText(locatorValue);
		} else if (locator.equals("tagname")) {
			return By.tagName(locatorValue);
		} else {
			throw new IllegalArgumentException("Invalid locator: " + locator);
		}
	}
}
