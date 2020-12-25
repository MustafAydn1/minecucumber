package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _07_ItemCategories {
    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();

    @And("^Navigate to Categories page$")
    public void navigateToCategoriesPage() {
        leftNav.findElementAndClickFunction("Inventory");
        leftNav.findElementAndClickFunction("setupButtonUnderInventory");
        leftNav.findElementAndClickFunction("ItemCategory");



    }


    @When("^User create a item categories name as \"([^\"]*)\" user type as \"([^\"]*)\"$")
    public void userCreateAItemCategoriesNameAsUserTypeAs(String itemName, String userType) {

        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput", itemName);
        dialogContent.findElementAndClickFunction("userTypeDropdown");

        dialogContent.selectUserType(userType);
        dialogContent.findElementAndClickFunction("saveButton");
    }
}
