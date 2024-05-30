package com.learning.web;

import org.testng.annotations.Test;
import pages.web.LoginPage;
import pages.web.enums.LeftMenuItemsType;

public class AddUserDemo extends BaseTest {

// want to run on local , remote(selenium grid , BS)


    @Test
    public void test() {


        new LoginPage().loginToApplication("Admin","admin123")
                .getLeftMenuComponent().setMenu(LeftMenuItemsType.ADMIN);



    }

    /*@BeforeSuite
    public void setTemplate() {
        FixtureFactoryLoader.loadTemplates("entity.pojo.template");
    }

    @DataProvider
    public Object[][] getData() {

        AddUser user = new AddUser("Admin", "", "", "", "", "");
        List<AddUser> users = Fixture.from(AddUser.class).gimme(3, "valid");

        return new Object[][]{{users.toArray()}};
    }


    @Test(dataProvider = "getData")
    public static void demoTest(AddUser data){
        new AddUserPage().addUserDetails(data);
        System.out.println(System.getProperty("user.dir"));
    }*/

}
