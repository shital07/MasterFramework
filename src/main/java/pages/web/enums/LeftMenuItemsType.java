package pages.web.enums;

import pages.web.AddUserPage;

import java.util.function.Supplier;

public enum LeftMenuItemsType {

    ADMIN("Admin", AddUserPage::init),
    PIM("PIM",AddUserPage::init),
    LEAVE("Leave",AddUserPage::init),
    TIME("Time", AddUserPage::init);


    private final String name;
    private final Supplier<?> pageClass;

    public Supplier<?> getPageClass() {
        return pageClass;
    }

    public String getName() {
        return name;
    }

    LeftMenuItemsType(String name,Supplier<?> pageClass){
        this.name=name;
        this.pageClass=pageClass;

    }
}
