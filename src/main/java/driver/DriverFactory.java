package driver;

import enums.RunMode;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {


    private DriverFactory() {

    }


    public static Map<RunMode, Supplier<IWebDriver>> WEB = new EnumMap<>(RunMode.class);
    public static Map<RunMode, Supplier<IMobileDriver>> MOBILE = new EnumMap<>(RunMode.class);

    static {
        WEB.put(RunMode.LOCAL, LocalWebDriverImpl::new);
        WEB.put(RunMode.REMOTE, RemoteWebDriverImpl::new);
        MOBILE.put(RunMode.LOCAL, LocalMobileDriverImpl::new);
        MOBILE.put(RunMode.REMOTE, RemoteMobileDriverImpl::new);
    }

    public static IWebDriver getDriverForWeb(RunMode runMode) {

        return WEB.get(runMode).get();
    }

    public static IMobileDriver getDriverForMobile(RunMode runMode) {
        return MOBILE.get(runMode).get();

    }
}
