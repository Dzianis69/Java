package com.OrangeHRM.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = "src\\test\\resources\\features"
		,glue ="com\\OrangeHRM\\steps"
		,dryRun = false
		,tags = {"@smoke"}
		,plugin ={"pretty","html:target\\cucu","json:target/cucumber.json"}
		//,monochrome = true
		)

public class TestRunner {

}
