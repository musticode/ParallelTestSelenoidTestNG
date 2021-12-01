package com.example.paralleltestgridtestng.TestClass;

import com.example.paralleltestgridtestng.Base.BaseTestSelenoid;
import org.testng.annotations.Test;

public class FirstTest extends BaseTestSelenoid {

    @Test
    public void GOOGLE1(){
        getDriver().get("https://www.google.com/");
    }
    @Test
    public void GOOGLE2(){
        getDriver().get("https://www.google.com/");
    }
    @Test
    public void GOOGLE3(){
        getDriver().get("https://www.google.com/");

    }
}
