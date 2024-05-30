package com.learning.mobile;

import org.testng.annotations.Test;
import pages.mobile.HomeScreen;

public class DemoAndroidTest extends BaseTest{


    @Test
    public static void demoTest(){

        HomeScreen.getHomeScreen()
                .getView_button()
                .clickViewElement("Layouts");

    }
}
