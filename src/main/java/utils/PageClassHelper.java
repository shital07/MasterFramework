package utils;

import driver.DriverManager;
import org.openqa.selenium.By;

public class PageClassHelper {
    private PageClassHelper() {

    }

    public static void waitAndClick(By by) {

        DriverManager.getDriver().findElement(by).click();
    }

    public static void waitAndSendKey(By by, String text) {

        DriverManager.getDriver().findElement(by).sendKeys(text);
    }
}
