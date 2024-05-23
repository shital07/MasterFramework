package com.learning;

import configuration.ConfigFactory;
import configuration.FrameworkConfig;
import org.testng.annotations.Test;

public class DemoTest extends BaseTest{

// want to run on local , remote(selenium grid , BS)


    @Test
    public void test() {

        System.out.println(ConfigFactory.getConfig().browser());

    }

}
