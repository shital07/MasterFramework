package driver;

import configuration.ConfigFactory;
import driver.factory.web.local.LocalDriverFactory;
import enums.BrowserType;

import java.util.Objects;

public final class Driver {


    private Driver() {

    }

    public static void initDriverForWeb() {

        DriverData drivereData = DriverData.builder().browserType(ConfigFactory.getConfig().browser())
                .runMode(ConfigFactory.getConfig().runbrowsermode())
                .remoteModeType(ConfigFactory.getConfig().remotebrowsermodetype())
                .build();

        DriverFactory.getDriverForWeb(drivereData);
    }

    public static void initDriverForMobile() {


        DriverData drivereData = DriverData.builder().browserType(ConfigFactory.getConfig().browser())
                .runMode(ConfigFactory.getMobileConfig().runmobilemode())
                .remoteModeType(ConfigFactory.getMobileConfig().remotemobilemodetype())
                .mobilePlatformType(ConfigFactory.getMobileConfig().platformtype())
                .build();

        DriverFactory.getDriverForMobile(drivereData);


    }




    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }

}
