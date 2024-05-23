package driver.web.remote;

import enums.BrowserType;
import enums.RemoteModeType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {
    private RemoteDriverFactory() {

    }


    public static WebDriver getDriver(RemoteModeType remoteModeType, BrowserType browserType) {

        //RemoteModeType remotemodetype = ConfigFactory.getConfig().remotemodetype();

       return remoteModeType.equals(RemoteModeType.SELENIUM_GRID) ? SeleniumGridFactory.getDriver(browserType) : BrowserstackFactory.getDriver(browserType);


    }

}
