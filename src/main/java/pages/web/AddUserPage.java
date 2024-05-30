package pages.web;

import entity.pojo.AddUser;
import org.openqa.selenium.By;
import utils.PageClassHelper;

public class AddUserPage {


    private static final By add_button = By.xpath("//button[text()=' Add ']");
    private static final String dropdown_arrow = "//*[@class='oxd-label oxd-input-field-required' and text()='%s']/../following-sibling::div//div[@class='oxd-select-text--after']";
    private static final String dropdown_item = "//*[@class='oxd-label oxd-input-field-required' and text()='Status']/../following-sibling::div//div[@class='oxd-select-option']/span";

    private static final By password = By.xpath("//label[text()='Password']/../following-sibling::div/input[@type = 'password']");

    private static final By confirmPass_textbox = By.xpath("//label[text()='Confirm Password']/../following-sibling::div/input[@type = 'password']");


    private final By submit_buttn = By.xpath("//button[@type='submit']");
    private final By employee_textbox = By.xpath("//label[text()='Employee Name']/../following-sibling::div//input");


    private String textbox = "//label[text()='%s']/../following-sibling::div//input";

    private AddUserPage() {

    }

    public static AddUserPage init() {
        return new AddUserPage();
    }

    private AddUserPage setAdd_button() {
        PageClassHelper.waitAndClick(add_button);
        return this;
    }

    private AddUserPage setDropdown_arrow(String menu) {
        String newXpath = String.format(dropdown_arrow, menu);
        PageClassHelper.waitAndClick(By.xpath(newXpath));
        return this;
    }

    private AddUserPage setDropdown_item(String menu, String item) {

        String newXpath = String.format(dropdown_item, menu);
        PageClassHelper.selectFromList(By.xpath(newXpath), item);

        return this;
    }

    private AddUserPage setTextBox(String menu, String text) {
        String newXpath = String.format(textbox, menu);
        PageClassHelper.waitAndSendKey(By.xpath(newXpath), text);
        return this;

    }


    private AddUserPage setSubmit_buttn() {
        PageClassHelper.waitAndClick(submit_buttn);
        return this;
    }

    public AddUserPage addUserDetails(AddUser data) {

        setAdd_button().setDropdown_arrow("User Role").setDropdown_item("User Role", data.getUserRole()).setTextBox("Status", data.getStatus()).setTextBox("Employee Name", data.getEmpName()).setTextBox("Username", data.getUserName()).setTextBox("Password", data.getPassword()).setTextBox("Confirm Password", data.getConfirmPassword()).setSubmit_buttn();


        return this;
    }
}
