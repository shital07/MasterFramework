package com.learning.web;

import configuration.ConfigFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.enums.LeftMenuItemsType;

public class AddUserDemo extends BaseTest{

// want to run on local , remote(selenium grid , BS)


    @Test
    public void test() {

        new LoginPage().loginToApplication("Admin","admin123")
                .getLeftMenuComponent()
                .setMenu(LeftMenuItemsType.ADMIN);

    }

}
