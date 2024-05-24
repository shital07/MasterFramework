package driver.web.remote;

import driver.driverManager.web.remote.seleniumgrid.SeleniumGridChromeManager;
import driver.driverManager.web.remote.seleniumgrid.SeleniumGridFirefoxManager;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SeleniumGridFactory {

    public static Map<BrowserType, Supplier<WebDriver>> mp = new EnumMap<>(BrowserType.class);

    static {
        mp.put(BrowserType.CHROME, SeleniumGridChromeManager::getDriver);
        mp.put(BrowserType.FIREFOX, SeleniumGridFirefoxManager::getDriver);
    }

    private SeleniumGridFactory() {

    }

    public static WebDriver getDriver(BrowserType browserType) {

        return mp.get(browserType).get();

    }


}
