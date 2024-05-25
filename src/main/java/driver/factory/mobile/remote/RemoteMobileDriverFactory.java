package driver.factory.mobile.remote;

import driver.factory.web.remote.BrowserstackFactory;
import driver.factory.web.remote.SeleniumGridFactory;
import enums.BrowserType;
import enums.MobilePlatformType;
import enums.RemoteModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteMobileDriverFactory {

    private RemoteMobileDriverFactory(){

    }


    public static Map<RemoteModeType, Function<MobilePlatformType, WebDriver>> mp = new EnumMap<>(RemoteModeType.class);

    static {
        mp.put(RemoteModeType.SELENIUM_GRID, SeleniumGridMobileFactory::getDriver);
        mp.put(RemoteModeType.BROWSER_STACK, BrowserstackMobileFactory::getDriver);


    }

    public static WebDriver getDriver(RemoteModeType remoteModeType, MobilePlatformType mobilePlatformType) {

        return mp.get(remoteModeType).apply(mobilePlatformType);
    }

}
