package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featurefile", glue = "com.stepDef"
                  
                  ,plugin = {"html:cucumberReports/htmlreport1","pretty","json:cucumberReports/jsonreport1.json"})

public class Runner {

}
