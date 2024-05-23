package driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    public static ThreadLocal<WebDriver> td = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return td.get();
    }

    public static void setDriver(WebDriver driver) {
        td.set(driver);
    }

    public static void unload() {
        td.remove();
    }


}
