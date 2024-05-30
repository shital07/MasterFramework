package pages.mobile;

import io.appium.java_client.AppiumBy;
import utils.PageClassHelper;

public class viewScreen {

    private static final String VIEW_SCREEN_ELEMENT = "%s";

    public void clickViewElement(String element){
        String xpath = String.format(VIEW_SCREEN_ELEMENT, element);
        PageClassHelper.scrollForMobile(AppiumBy.accessibilityId(xpath));
        PageClassHelper.waitAndClick(AppiumBy.accessibilityId(element));
    }
}
