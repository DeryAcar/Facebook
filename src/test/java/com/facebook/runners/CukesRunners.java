package com.facebook.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"html:target/cucumber-reports", "json:target/cucumber.json"},
		features="./src/test/resources/feature",
		glue="com.facebook.step_definations",
		tags="@smoke",
		dryRun=false )
public class CukesRunners {

}
