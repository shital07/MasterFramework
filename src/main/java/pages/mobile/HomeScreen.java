package pages.mobile;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import utils.PageClassHelper;

public class HomeScreen {
    private static final By view_button = AppiumBy.accessibilityId("Views");

    private HomeScreen() {

    }

    public static HomeScreen getHomeScreen() {
        return new HomeScreen();
    }

    public viewScreen getView_button() {
        PageClassHelper.scrollForMobile(view_button);
        PageClassHelper.waitAndClick(view_button);
        return new viewScreen();

    }
}
