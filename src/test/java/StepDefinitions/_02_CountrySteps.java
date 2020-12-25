package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _02_CountrySteps {

    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();

    @Then("^Navigate to country page$")
    public void navigate_to_country_page() {

        leftNav.findElementAndClickFunction("setupOne");
        leftNav.findElementAndClickFunction("parameters");
        leftNav.findElementAndClickFunction("country");
    }

    @When("^Create a country$")
    public void create_a_country()  {

        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput", "ismetUlkesi61a");
        dialogContent.findElementAndSendKeysFunction("codeInput", "092456a");
        dialogContent.findElementAndClickFunction("saveButton");

    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed() {
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
    }

    @When("^Create a country name as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void create_a_country_name_as_and_code_as(String namee1, String codee1) {

        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput", namee1);
        dialogContent.findElementAndSendKeysFunction("codeInput", codee1);
        dialogContent.findElementAndClickFunction("saveButton");
 // DEMEK Kİ: Buraya yazılan name-code nin feature deki name-code ile ilgisi yok
 //Sadece dogru stepse adı ne olursa olsun bir string yolla.Feature bunu bilip,
 //Kendisindeki "" lı Sringleri doğru yere yolluyor.


    }
}
