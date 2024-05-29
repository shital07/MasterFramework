package utils;

import driver.DriverManager;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitStrategy {


    public static <T> T performExplicitWait(ExpectedCondition<T> condition){

        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5));

      return   webDriverWait.until(condition);

    }



}
