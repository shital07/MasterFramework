package driver.web.remote;

import driver.driverManager.web.remote.seleniumgrid.SeleniumGridChromeManager;
import driver.driverManager.web.remote.seleniumgrid.SeleniumGridFirefoxManager;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {
    private SeleniumGridFactory() {

    }

    public static WebDriver getDriver(BrowserType browserType) {

        return browserType.equals(BrowserType.CHROME) ? SeleniumGridChromeManager.getDriver() : SeleniumGridFirefoxManager.getDriver();


    }


}
