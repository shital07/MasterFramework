package driver.driverManager.web.remote.browserstack;

import configuration.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserstackFriefoxManager {

    private BrowserstackFriefoxManager(){

    }

    public static WebDriver getDriver(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox");
        return new RemoteWebDriver(ConfigFactory.getConfig().browserstackurl(), capabilities);

    }


}
