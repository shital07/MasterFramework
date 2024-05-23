package driver.web.remote;

import driver.driverManager.web.remote.browserstack.BrowserstackChromeManager;
import driver.driverManager.web.remote.browserstack.BrowserstackFriefoxManager;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class BrowserstackFactory {

    private BrowserstackFactory(){

    }

    public static WebDriver getDriver(BrowserType browserType){

       return browserType.equals(BrowserType.CHROME)?
                BrowserstackChromeManager.getDriver() :
                BrowserstackFriefoxManager.getDriver();



    }


}
