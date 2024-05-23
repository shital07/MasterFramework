package driver.web.local;

import driver.driverManager.web.local.ChromeManager;
import driver.driverManager.web.local.FirefoxManager;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {
    private LocalDriverFactory() {

    }

    protected static WebDriver getDriver(BrowserType browserType) {
        WebDriver driver = null;
        return browserType.equals(BrowserType.CHROME) ? ChromeManager.getDriver()
                : FirefoxManager.getDriver();
    }

}
