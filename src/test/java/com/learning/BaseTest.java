package com.learning;

import driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    @BeforeMethod
    public void beforeMethodSetup() {
        Driver.initDriver();
    }


    @AfterMethod
    public void afterMethodTearDown() {
        Driver.quitDriver();
    }
}
