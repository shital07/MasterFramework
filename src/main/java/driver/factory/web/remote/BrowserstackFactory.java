package driver.factory.web.remote;

import driver.manager.web.remote.browserstack.BrowserstackChromeManager;
import driver.manager.web.remote.browserstack.BrowserstackFriefoxManager;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserstackFactory {

    private BrowserstackFactory() {

    }

    public static Map<BrowserType, Supplier<WebDriver>> mp = new EnumMap<>(BrowserType.class);

    static {
        mp.put(BrowserType.CHROME, BrowserstackChromeManager::getDriver);
        mp.put(BrowserType.FIREFOX, BrowserstackFriefoxManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {

        return mp.get(browserType).get();

    }


}
