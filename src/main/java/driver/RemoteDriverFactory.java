package driver;

import configuration.ConfigFactory;
import enums.RemoteModeType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {
    private RemoteDriverFactory() {

    }


    public static WebDriver getDriver() {

        RemoteModeType remotemodetype = ConfigFactory.getConfig().remotemodetype();

        if (remotemodetype == RemoteModeType.SELENIUM_GRID) {

        } else if (remotemodetype == RemoteModeType.BROWSER_STACK) {


        } else {

        }



        return null;
    }

}
