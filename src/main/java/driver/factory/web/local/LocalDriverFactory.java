package driver.web.local;

import driver.driverManager.web.local.ChromeManager;
import driver.driverManager.web.local.FirefoxManager;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalDriverFactory {
    private LocalDriverFactory() {

    }

   public static Map<BrowserType, Supplier<WebDriver>> mp =  new EnumMap<>(BrowserType.class);

    static {
        mp.put(BrowserType.CHROME, ChromeManager::getDriver);
        mp.put(BrowserType.FIREFOX, FirefoxManager::getDriver);


    }

    public static WebDriver getDriver(BrowserType browserType) {

        return mp.get(browserType).get();
    }

}
