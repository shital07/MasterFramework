package pages;

import pages.pagecomponent.homepage.LeftMenuComponent;

public class HomePage {

    LeftMenuComponent leftMenuComponent;

    public LeftMenuComponent getLeftMenuComponent() {
        return new LeftMenuComponent();
    }
}
