package com.abc.amazon.base;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * Created by Sumedha on 6/27/2016.
 */
public class Init {

    public void initialization() throws IOException {
        BaseClass.prop =  new Properties();
        String path = new File("src/main/resources/config/config.properties").getAbsolutePath();
        FileInputStream input = new FileInputStream(path);
        BaseClass.prop.load(input);
        String browser = BaseClass.prop.getProperty(Config.BROWSER.toString().toLowerCase());
        String env = BaseClass.prop.getProperty("env");



        switch(env) {
            case "local":
                setBrowserProp(browser);
                BaseClass.driver = setDriver(browser);
                break;
            case "remote":
                BaseClass.driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),setCapabilities(browser));
        }

    }

    private DesiredCapabilities setCapabilities(String browser){
        DesiredCapabilities cap ;
        switch (browser){
            case "chrome": cap = DesiredCapabilities.chrome();
                break;
            case "firefox": cap = DesiredCapabilities.firefox();
                break;
            case "IE" : cap = DesiredCapabilities.internetExplorer();
                break;
            default: cap = DesiredCapabilities.chrome();
                break;
        }
        cap.setBrowserName(browser);
        cap.setJavascriptEnabled(true);
        cap.setPlatform(Platform.ANY);

        return cap;
    }

    private void setProperties (String browser){
        String path;
        switch (browser){
            case "chrome":
                 path = new File("src/main/resources/config/chromedriver.exe").getAbsolutePath();
                System.setProperty("webdriver.chrome.driver",path);
                break;
            case "firefox":
                break;
            default:
                path = new File("src/main/resources/config/chromedriver.exe").getAbsolutePath();
                System.setProperty("webdriver.chrome.driver",path);
                break;
        }

    }

    private void setBrowserProp(String browser){
        switch (browser) {
            case "chrome":
                setCapabilities(Config.CHROME.toString().toLowerCase());
                setProperties(Config.CHROME.toString().toLowerCase());
                break;
            case "firefox":
                setCapabilities(Config.FIREFOX.toString().toLowerCase());
                setProperties(Config.FIREFOX.toString().toLowerCase());
                break;
            default:
                setCapabilities(Config.CHROME.toString().toLowerCase());
                setProperties(Config.CHROME.toString().toLowerCase());
                break;
        }

    }
    private WebDriver setDriver(String browser){
        WebDriver driver;
      switch (browser){
          case "chrome": driver = new ChromeDriver();
              break;
          case "firefox": driver =  new FirefoxDriver();
              break;
          default: driver = new ChromeDriver();
              break;
      }
        return driver;
    }
}
