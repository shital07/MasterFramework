package utils;

import driver.DriverManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class PageClassHelper {
    private PageClassHelper() {

    }

    public static void waitAndClick(By by) {

        DriverManager.getDriver().findElement(by).click();
    }

    public static void waitAndSendKey(By by, String text) {

        DriverManager.getDriver().findElement(by).sendKeys(text);
    }


    public static void waitAndClickWE(WebElement element) {
        element.click();
    }

    public static void selectFromList(By by, String item) {

        DriverManager.getDriver().findElements(by).parallelStream().filter((e) -> e.getText().equalsIgnoreCase(item)).findFirst().get().click();

    }



   /* List<WebElement> elementList = DriverManager.getDriver().findElements(AppiumBy.xpath(""));

        if (isAndroid()){
        return elementList.isEmpty();
    }*/


    public static void scrollForMobile(By by) {

        String previousPageSource = null;
        while (isElementNotEnabled(by) && isNotTheEndOfPage(previousPageSource)) {
            previousPageSource = DriverManager.getDriver().getPageSource();
            performScroll();
        }

    }

    private static boolean isNotTheEndOfPage(String previousPageSource) {
        return !DriverManager.getDriver().getPageSource().equalsIgnoreCase(previousPageSource);

    }

    public static boolean isElementNotEnabled(By by) {
        List<WebElement> elementList = DriverManager.getDriver().findElements(by);

        if (isAndroid()) {
            return elementList.isEmpty();

        }
        if (!elementList.isEmpty()) {

            return elementList.get(0).getAttribute("visible").equalsIgnoreCase("false");

        }

        return true;
    }

    public static boolean isAndroid() {

        return DriverManager.getDriver() instanceof AndroidDriver;

    }

    public static void performScroll() {
        Dimension size = DriverManager.getDriver().manage().window().getSize();
        int height = size.getHeight()/2;
        int width = size.getWidth()/2;
        System.out.println(height + " " + width);
        Point point = new Point(width , height);
        Point point1 = new Point(width ,( height - (int)( height * 0.24)));

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1);
        sequence.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), point))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofSeconds(5)))
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), point1))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        ((AndroidDriver) DriverManager.getDriver()).perform(Collections.singletonList(sequence));


    }


}
