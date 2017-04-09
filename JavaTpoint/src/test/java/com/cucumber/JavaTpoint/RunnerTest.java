package com.cucumber.JavaTpoint;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"scr/test/resource"}
		//plugin ="pretty,json:target/json/king.json,html:target/html/"
		)
public class RunnerTest {

}
