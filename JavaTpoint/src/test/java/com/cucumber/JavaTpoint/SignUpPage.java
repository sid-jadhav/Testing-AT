package com.cucumber.JavaTpoint;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;

public class SignUpPage extends AbstractPage{

	public SignUpPage(WebDriver driver) {
		super(driver);
	}
	
	public SignUpPage FillDetails(DataTable Fields){
		List<List<String>> data = Fields.raw();
		int i=1;
		while(i <= Integer.valueOf(data.get(0).get(0)))
		{	
			driver.findElement(By.name(data.get(i).get(1))).sendKeys(data.get(i).get(0));
			i++;
		}
		return new SignUpPage(driver);
	}
	public FacebookHomePage ClickOnSignIn(String link){
		driver.findElement(By.id(link)).click();
		return new FacebookHomePage(driver);
	}

}
