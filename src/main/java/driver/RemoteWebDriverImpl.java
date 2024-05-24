package driver;

import driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver{
    @Override
    public WebDriver getDriver(WebDriverData data) {
        return RemoteDriverFactory.getDriver(data.getRemoteModeType(), data.getBrowserType());
    }
}
