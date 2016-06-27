package com.abc.amazon.steps;

import com.abc.amazon.base.BaseClass;
import com.abc.amazon.base.Init;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

/**
 * Created by Sumedha on 6/27/2016.
 */
public class CommonSteps extends BaseClass{

    @Before
    public static void init() throws IOException {
        Init  init = new Init();
        init.initialization();
    }

    @After
    public static void finalRun(){
        driver.close();
        driver.quit();

    }
}
