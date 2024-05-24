package driver;

import enums.RunMode;
import org.openqa.selenium.WebDriver;

public final class DriverFactory {


    private DriverFactory() {

    }


    public static WebDriver getDriverForWeb(WebDriverData data) {


        if (data.getRunMode().equals(RunMode.LOCAL)) {
            return new LocalWebDriverImpl().getDriver(data);
        } else {
            return new RemoteWebDriverImpl().getDriver(data);
        }


    }

    public static WebDriver getDriverForMobile(MobileDriverData data) {
        if (data.getRunMode().equals(RunMode.LOCAL)) {
            return new LocalMobileDriverImpl().getDriver(data);
        } else {
            return new RemoteMobileDriverImpl().getDriver(data);
        }


    }
}
