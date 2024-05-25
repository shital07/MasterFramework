package pages.pagecomponent.homepage;

import org.openqa.selenium.By;
import pages.enums.LeftMenuItemsType;
import utils.PageClassHelper;

public class LeftMenuComponent {



    private static final String  MENU ="//span[text()='%s']/..";

    public LeftMenuComponent setMenu(LeftMenuItemsType menuName) {
        String newXpath = String.format(MENU,menuName.getName());
        PageClassHelper.waitAndClick(By.xpath(newXpath));
        return this;
    }
}
