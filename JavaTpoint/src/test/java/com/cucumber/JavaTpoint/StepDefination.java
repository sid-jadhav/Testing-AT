package com.cucumber.JavaTpoint;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	WebDriver driver;
	@Before
	public void SetUp(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO\\Sid2\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
	@After
	public void Closer() throws Throwable {
		Thread.sleep(10000);
		driver.quit();
	}
	AbstractPage abs;
	HomePage home;
	SignUpPage fill;
	@Given("^Open \"(.*?)\" homepage$")
	public void open_homepage(String link) throws Throwable {
		abs= new AbstractPage(driver);
		abs.NavigateToHome(link);
	}

	@Given("^go to \"(.*?)\" tab$")
	public void go_to_tab(String link) throws Throwable {
//		driver.findElement(By.cssSelector(".signup_btn")).click();
//		Thread.sleep(5000);
		home= new HomePage(driver);
		home.NavigateTo();
	}

	@When("^We fill in FirstNameValue in FirstName$")
	public void we_fill_in_in(DataTable Fields) throws Throwable {
//		List<List<String>> data = Fields.raw();
//		int i=1;
//		while(i <= Integer.valueOf(data.get(0).get(0)))
//		{	
//			driver.findElement(By.name(data.get(i).get(1))).sendKeys(data.get(i).get(0));
//			i++;
//		}
		fill =new SignUpPage(driver);
		fill.FillDetails(Fields);
	}

	@Then("^Title as \"([^\"]*)\"$")
	public void title_as(String link) throws Throwable {
	//driver.findElement(By.id(link)).click();
		fill.ClickOnSignIn(link);
	}

}
