package pages.enums;

public enum LeftMenuItemsType {

    ADMIN("Admin"),
    PIM("PIM"),
    LEAVE("Leave"),
    TIME("Time");


    private final String name;

    public String getName() {
        return name;
    }

    LeftMenuItemsType(String name){
        this.name=name;
    }
}
