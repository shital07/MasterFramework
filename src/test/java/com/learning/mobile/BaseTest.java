package com.learning.mobile;

import configuration.ConfigFactory;
import driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    @BeforeMethod
    public void beforeMethodSetup() {
        System.out.println(ConfigFactory.getMobileConfig().appapkpath());
        Driver.initDriverForMobile();
    }


    @AfterMethod
    public void afterMethodTearDown() {
        Driver.quitDriver();
    }
}
