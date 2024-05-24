package driver;

import driver.factory.mobile.remote.RemoteMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver {
    @Override
    public WebDriver getDriver(MobileDriverData data) {
        return RemoteMobileDriverFactory.getDriver(data.getRemoteModeType(), data.getMobilePlatformType());
    }
}
