package driver;

import configuration.ConfigFactory;
import driver.driverType.ChromeManager;
import driver.driverType.FirefoxManager;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {
    private LocalDriverFactory() {

    }

    protected static WebDriver getDriver() {
        WebDriver driver = null;
        BrowserType browser = ConfigFactory.getConfig().browser();

        if (browser.equals(BrowserType.CHROME)) {

            driver = ChromeManager.getDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            driver = FirefoxManager.getDriver();
        } else {
            driver = ChromeManager.getDriver();
        }

        return driver;
    }

}
