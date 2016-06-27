package com.abc.amazon.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Sumedha on 6/27/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features/", glue = "com.abc.amazon.steps",
format = {"pretty", "html:target/cucumber"})
public class CucumberRunner {


}
