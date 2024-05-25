package driver;

import enums.PlatformType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;

public class DriverManager {

    private static ThreadLocal<WebDriver> WEB_THREADLOCAL = new ThreadLocal<>();
    private static ThreadLocal<WebDriver> MOBILE_THREADLOCAL = new ThreadLocal<>();

    private static ThreadLocal<PlatformType> CONTEXT = ThreadLocal.withInitial(() -> PlatformType.WEB);

    private static Map<PlatformType, ThreadLocal<WebDriver>> MAP = new EnumMap<>(PlatformType.class);

    public static WebDriver getDriver() {

        if (CONTEXT.get() == PlatformType.WEB){
           return WEB_THREADLOCAL.get();
        }else{
            return MOBILE_THREADLOCAL.get();
        }


      //  return CONTEXT.get() == PlatformType.WEB ? WEB_THREADLOCAL.get() : MOBILE_THREADLOCAL.get();


    }

    public static void setDriver(WebDriver driver) {

        if (driver instanceof AndroidDriver || driver instanceof IOSDriver) {
            CONTEXT.set(PlatformType.MOBILE);

            MAP.put(PlatformType.MOBILE, MOBILE_THREADLOCAL);
            MOBILE_THREADLOCAL.set(driver);
        } else {
            CONTEXT.set(PlatformType.WEB);

            MAP.put(PlatformType.WEB, WEB_THREADLOCAL);
            WEB_THREADLOCAL.set(driver);
        }


    }

    public static void unload() {
        WEB_THREADLOCAL.remove();
        MOBILE_THREADLOCAL.remove();
        CONTEXT.remove();

    }


}
