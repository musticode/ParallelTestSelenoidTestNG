package com.example.paralleltestgridtestng.Configuration;

import org.openqa.selenium.remote.DesiredCapabilities;

public class SelenoidCapabilityFactory {
    public DesiredCapabilities desiredCapabilities;

    public DesiredCapabilities getSelenoidCapability(String browserName){
        if(browserName.equals("chrome")){
            desiredCapabilities = DesiredCapForSelenoid.getChromeDesiredCapabilities();
        }else if(browserName.equals("firefox")){
            desiredCapabilities = DesiredCapForSelenoid.getFirefoxDesiredCapabilities();
        }else if(browserName.equals("opera")){
            desiredCapabilities = DesiredCapForSelenoid.getOperaDesiredCapabilities();
        }
        return desiredCapabilities;

    }
}
