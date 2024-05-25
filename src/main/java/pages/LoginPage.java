package pages;

import org.openqa.selenium.By;
import utils.PageClassHelper;

public class LoginPage {


    private static final By PASSWORD_TEXTBOOK = By.name("password");
    private static final By USERNAME_TEXTBOOK = By.name("username");

    private static final By LOGIN_BUTTON = By.xpath("//button[contains(text(),Login)]");

    private LoginPage setPaswoordTextbox(String pwd) {
        PageClassHelper.waitAndSendKey(PASSWORD_TEXTBOOK, pwd);
        return this;
    }

    private LoginPage setUsernameTextbox(String name) {
        PageClassHelper.waitAndSendKey(USERNAME_TEXTBOOK, name);
        return this;
    }

    private HomePage setLoginButton() {
        PageClassHelper.waitAndClick(LOGIN_BUTTON);
        return new HomePage();
    }

    public HomePage loginToApplication(String name, String pwd) {
       return setUsernameTextbox(name).setPaswoordTextbox(pwd).setLoginButton();


    }
}
