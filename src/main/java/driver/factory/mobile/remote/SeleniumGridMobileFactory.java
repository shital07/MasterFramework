package driver.factory.mobile.remote;

import driver.manager.mobile.remote.seleniumgrid.SeleniumGridAndroidManager;
import driver.manager.mobile.remote.seleniumgrid.SeleniumGridIOSManager;
import enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SeleniumGridMobileFactory {

    private SeleniumGridMobileFactory(){

    }

    public static Map<MobilePlatformType, Supplier<WebDriver>> mp = new EnumMap<>(MobilePlatformType.class);

    static {
        mp.put(MobilePlatformType.ANDROID, SeleniumGridAndroidManager::getDriver);
        mp.put(MobilePlatformType.IOS, SeleniumGridIOSManager::getDriver);
    }


    public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {

        return mp.get(mobilePlatformType).get();

    }
}
