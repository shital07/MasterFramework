package driver.driverManager.web.remote.seleniumgrid;

import configuration.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SeleniumGridFirefoxManager {
    private SeleniumGridFirefoxManager(){

    }

    public static WebDriver getDriver(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox");
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumgridurl(),capabilities);

    }

}
