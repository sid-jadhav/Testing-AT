package com.cucumber.JavaTpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public SignUpPage NavigateTo() throws Throwable{
		driver.findElement(By.cssSelector(".signup_btn")).click();
		Thread.sleep(5000);
		return new SignUpPage(driver);
	}
}
