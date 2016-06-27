package com.abc.amazon.test;

import com.abc.amazon.base.BaseClass;
import com.abc.amazon.base.Config;
import com.abc.amazon.base.Init;

import java.io.IOException;

/**
 * Created by Sumedha on 6/27/2016.
 */
public class Test extends BaseClass{

    public static void main(String[] args) throws IOException {

        Init init = new Init();
        init.initialization();
        driver.get(prop.getProperty(Config.URL.toString().toLowerCase()));

    }
}
