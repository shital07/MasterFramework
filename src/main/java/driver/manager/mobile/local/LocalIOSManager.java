package driver.manager.mobile.local;

import configuration.ConfigFactory;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class LocalIOSManager {

    private LocalIOSManager(){

    }



    public static WebDriver getDriver(){

        XCUITestOptions options = new XCUITestOptions();
        options.setApp(ConfigFactory.getMobileConfig().appapkpath());

        return new RemoteWebDriver(ConfigFactory.getMobileConfig().localurl(),options);


    }
}
