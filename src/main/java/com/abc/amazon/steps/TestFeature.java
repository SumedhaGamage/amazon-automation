package com.abc.amazon.steps;

import com.abc.amazon.base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;

/**
 * Created by Sumedha on 6/27/2016.
 */
public class TestFeature extends BaseClass{

    @Given("^I open web browser$")
    public static void openBrowser(){
        if(driver!=null)
        System.out.println("Driver initiated");
    }
    @And("^navigate to (.*)$")
    public static void navigateToUrl(String url){
        System.out.println(url);
        driver.get(url);
    }
}
