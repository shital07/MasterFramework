package pages.web;


import pages.web.pagecomponent.homepage.LeftMenuComponent;

public class HomePage {

    LeftMenuComponent leftMenuComponent;

    public LeftMenuComponent getLeftMenuComponent() {
        return new LeftMenuComponent();
    }
}
