package com.example.paralleltestgridtestng.TestClass;

import com.example.paralleltestgridtestng.Base.BaseTestSelenoid;
import org.testng.annotations.Test;

public class GoogleSelenoidTest extends BaseTestSelenoid {
    @Test
    public void googleTest(){
        getDriver().get("https://www.google.com/");
    }
}
