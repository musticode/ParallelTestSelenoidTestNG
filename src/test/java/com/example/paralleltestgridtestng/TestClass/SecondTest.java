package com.example.paralleltestgridtestng.TestClass;

import com.example.paralleltestgridtestng.Base.BaseTestSelenoid;
import org.testng.annotations.Test;

public class SecondTest extends BaseTestSelenoid {
    @Test
    public void YANDEX(){
        getDriver().get("https://www.yandex.com/");
    }
    @Test
    public void GOOGLE4(){
        getDriver().get("https://www.google.com");
    }
}
