package driver.factory.mobile.local;

import driver.manager.mobile.local.LocalAndroidManager;
import driver.manager.mobile.local.LocalIOSManager;
import enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalMobileDriverFactory {


    public static Map<MobilePlatformType, Supplier<WebDriver>> mp = new EnumMap<>(MobilePlatformType.class);


    static {
        mp.put(MobilePlatformType.ANDROID, LocalAndroidManager::getDriver);
        mp.put(MobilePlatformType.IOS, LocalIOSManager::getDriver);
    }

    private LocalMobileDriverFactory() {

    }


    public static WebDriver getDriver(MobilePlatformType deviceType) {

        return mp.get(deviceType).get();


    }
}
