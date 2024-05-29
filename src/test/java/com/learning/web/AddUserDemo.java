package com.learning.web;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import entity.pojo.AddUser;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AddUserPage;
import pages.LoginPage;
import pages.enums.LeftMenuItemsType;

import java.util.List;

public class AddUserDemo extends BaseTest {

// want to run on local , remote(selenium grid , BS)


    @Test
    public void test() {

        new LoginPage().loginToApplication("Admin", "admin123")
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
