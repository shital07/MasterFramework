package pages;

import io.appium.java_client.functions.ExpectedCondition;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ExplicitWaitStrategy;
import utils.PageClassHelper;

public class LoginPage {


    private static final By PASSWORD_TEXTBOOK = By.xpath("//*[@name='password']");
    private static final By USERNAME_TEXTBOOK = By.name("username");

    private static final By LOGIN_BUTTON = By.xpath("//button[contains(text(),Login)]");

    private LoginPage setPaswoordTextbox(String pwd) {
        ExplicitWaitStrategy.performExplicitWait(ExpectedConditions.visibilityOfElementLocated(PASSWORD_TEXTBOOK));

        PageClassHelper.waitAndSendKey(PASSWORD_TEXTBOOK, pwd);
        return this;
    }

    private LoginPage setUsernameTextbox(String name) {
        ExplicitWaitStrategy.performExplicitWait(ExpectedConditions.visibilityOfElementLocated(USERNAME_TEXTBOOK));
        PageClassHelper.waitAndSendKey(USERNAME_TEXTBOOK, name);
        return this;
    }

    private HomePage setLoginButton() {
        ExplicitWaitStrategy.performExplicitWait(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));

        PageClassHelper.waitAndClick(LOGIN_BUTTON);
        return new HomePage();
    }

    public HomePage loginToApplication(String name, String pwd) {
       return setUsernameTextbox(name).setPaswoordTextbox(pwd).setLoginButton();


    }
}
