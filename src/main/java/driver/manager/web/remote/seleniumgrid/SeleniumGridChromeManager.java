package driver.manager.web.remote.seleniumgrid;

import configuration.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SeleniumGridChromeManager {

    private SeleniumGridChromeManager(){

    }

    public static WebDriver getDriver(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumgridurl(),capabilities);

    }



}
