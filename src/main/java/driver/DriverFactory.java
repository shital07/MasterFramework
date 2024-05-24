package driver;

import driver.factory.mobile.local.LocalMobileDriverFactory;
import driver.factory.mobile.remote.RemoteMobileDriverFactory;
import driver.factory.web.local.LocalDriverFactory;
import driver.factory.web.remote.RemoteDriverFactory;
import enums.RunMode;
import org.openqa.selenium.WebDriver;

public final class DriverFactory {


    private DriverFactory() {

    }


    public static WebDriver getDriverForWeb(DriverData data) {

        WebDriver driver = null;
        if (data.getRunMode().equals(RunMode.LOCAL)) {
            driver = LocalDriverFactory.getDriver(data.getBrowserType());
        } else {
            RemoteDriverFactory.getDriver(data.getRemoteModeType(), data.getBrowserType());
        }

        return driver;
    }

    public static WebDriver getDriverForMobile(DriverData data) {


        WebDriver driver = null;
        if (data.getRunMode().equals(RunMode.LOCAL)) {

            driver = LocalMobileDriverFactory.getDriver(data.getMobilePlatformType());
        } else {

            driver = RemoteMobileDriverFactory.getDriver(data.getRemoteModeType(), data.getMobilePlatformType());
        }

        return driver;


    }
}
