package com.codedivers.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.codedivers.helper.Configurator;
import com.codedivers.helper.PropertyLoader;

public class Executor {

	WebDriver driver;
	
	Executor() {
		Configurator configuration = Configurator.getInstance();
		configuration.setBrowser("chrome");
		//driver = configuration.getDriver();
	}

	@Test
	public void main() {
		System.out.println(PropertyLoader.getInstance().getValue("driver"));
		PropertyLoader.getInstance().setValue("driver", "firefox");
		System.out.println(PropertyLoader.getInstance().getValue("driver"));
	}
	
}
