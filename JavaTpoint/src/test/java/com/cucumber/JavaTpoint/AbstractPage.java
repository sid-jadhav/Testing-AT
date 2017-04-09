package com.cucumber.JavaTpoint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractPage {
	protected WebDriver driver;
	public AbstractPage(WebDriver driver){
		this.driver= driver;
	}
	public HomePage NavigateToHome(String link){
		
		driver.navigate().to("https://en-gb."+link+".com/login/");
		return new HomePage(driver);
	}
}
