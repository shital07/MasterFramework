package driver;

import driver.factory.mobile.local.LocalMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver{
    @Override
    public WebDriver getDriver(MobileDriverData data) {
        return LocalMobileDriverFactory.getDriver(data.getMobilePlatformType());
    }
}
