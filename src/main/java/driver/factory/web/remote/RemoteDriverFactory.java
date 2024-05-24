package driver.factory.web.remote;

import enums.BrowserType;
import enums.RemoteModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteDriverFactory {


    public static Map<RemoteModeType, Function<BrowserType, WebDriver>> mp = new EnumMap<>(RemoteModeType.class);

    static {
        mp.put(RemoteModeType.SELENIUM_GRID, SeleniumGridFactory::getDriver);
        mp.put(RemoteModeType.BROWSER_STACK, BrowserstackFactory::getDriver);


    }

    private RemoteDriverFactory() {

    }

    public static WebDriver getDriver(RemoteModeType remoteModeType, BrowserType browserType) {

        return mp.get(remoteModeType).apply(browserType);
    }

}
