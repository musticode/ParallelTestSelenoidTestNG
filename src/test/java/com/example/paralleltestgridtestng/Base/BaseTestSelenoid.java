package com.example.paralleltestgridtestng.Base;

import com.example.paralleltestgridtestng.Configuration.SelenoidCapabilityFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.URL;

public class BaseTestSelenoid {
    protected static ThreadLocal<RemoteWebDriver> remoteDriver = new ThreadLocal<>();

    SelenoidCapabilityFactory cap = new SelenoidCapabilityFactory();


    @BeforeMethod
    @Parameters(value = "browser")
    public void initiallizeBrowser(String browser) throws Exception {
        remoteDriver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap.getSelenoidCapability(browser)));
    }
    public WebDriver getDriver(){
        return remoteDriver.get();
    }
    @AfterMethod
    public void tearDown() throws Exception {
        getDriver().quit();
    }
    @AfterTest
    public void terminate() throws Exception {
        remoteDriver.remove();
    }

}
