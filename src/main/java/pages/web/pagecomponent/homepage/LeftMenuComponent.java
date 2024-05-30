package pages.web.pagecomponent.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.web.enums.LeftMenuItemsType;
import utils.ExplicitWaitStrategy;
import utils.PageClassHelper;

public class LeftMenuComponent {


    private static final String MENU = "//span[text()='%s']/..";

    public Object setMenu(LeftMenuItemsType menuName) {
        String newXpath = String.format(MENU, menuName.getName());
        ExplicitWaitStrategy.performExplicitWait(ExpectedConditions.visibilityOfElementLocated(By.xpath(newXpath)));
        PageClassHelper.waitAndClick(By.xpath(newXpath));
        return menuName.getPageClass().get();


    }
}
