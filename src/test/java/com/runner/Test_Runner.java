package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featurefile",glue = "com.stepdefinition",
                     monochrome = true,dryRun = false, tags =("@login"),
                     plugin = {"html:Reports/Sauce.html","json:Reports/demo.json","pretty"})
public class Test_Runner {

}



