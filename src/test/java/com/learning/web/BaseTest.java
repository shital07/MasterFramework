package com.learning.web;

import configuration.ConfigFactory;
import driver.Driver;
import driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    @BeforeMethod
    public void beforeMethodSetup() {
        Driver.initDriverForWeb();
    }


    @AfterMethod
    public void afterMethodTearDown() {
        Driver.quitDriver();
    }
}
