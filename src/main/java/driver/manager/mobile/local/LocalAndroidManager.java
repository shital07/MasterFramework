package driver.manager.mobile.local;

import configuration.ConfigFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class LocalAndroidManager {

    private LocalAndroidManager() {

    }

    public static WebDriver getDriver() {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setApp(ConfigFactory.getMobileConfig().appapkpath());


        return new AndroidDriver(ConfigFactory.getMobileConfig().localurl(), options);


    }
}
