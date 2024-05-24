package driver;

import driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverData data) {
        return LocalDriverFactory.getDriver(data.getBrowserType());
    }
}
