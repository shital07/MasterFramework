package driver.manager.mobile.remote.browserstack;

import configuration.ConfigFactory;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackIOSManager {

    private BrowserStackIOSManager() {

    }

    public static WebDriver getDriver() {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setApp(ConfigFactory.getMobileConfig().appapkpath());

        return new RemoteWebDriver(ConfigFactory.getMobileConfig().localurl(), options);


    }
}
