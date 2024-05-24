package driver;

import configuration.ConfigFactory;
import driver.factory.web.local.LocalDriverFactory;
import enums.BrowserType;

import java.util.Objects;

public final class Driver {


    private Driver() {

    }

    public static void initDriver() {

        BrowserType browser = ConfigFactory.getConfig().browser();

        if (Objects.isNull(DriverManager.getDriver())) {
            DriverManager.setDriver(LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser()));
        }

        DriverManager.getDriver().get(ConfigFactory.getConfig().url());
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }

}
