package driver;

import configuration.ConfigFactory;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public final class Driver {


    public static WebDriver driver;

    private Driver() {

    }

    public static void initDriverForWeb() {

        if (Objects.isNull(DriverManager.getDriver())) {

            WebDriverData data = new WebDriverData(ConfigFactory.getConfig().browser(), ConfigFactory.getConfig().remotebrowsermodetype());
            driver = DriverFactory.getDriverForWeb(ConfigFactory.getConfig().runbrowsermode()).getDriver(data);
            DriverManager.setDriver(driver);
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            loadUrl();
        }
    }

    public static void initDriverForMobile() {
        if (Objects.isNull(DriverManager.getDriver())) {
            MobileDriverData data = new MobileDriverData(ConfigFactory.getMobileConfig().remotemobilemodetype(), ConfigFactory.getMobileConfig().platformtype());
            driver = DriverFactory.getDriverForMobile(ConfigFactory.getMobileConfig().runmobilemode()).getDriver(data);
            DriverManager.setDriver(driver);

        }

    }
    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }

    public static void loadUrl(){
        System.out.println(ConfigFactory.getConfig().weburl());
        DriverManager.getDriver().get(ConfigFactory.getConfig().weburl());
    }

}
