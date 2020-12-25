package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _10_ApachePOISteps {
    DialogContent dialogContent=new DialogContent();

    @When("^User create citizenship with ApachePOI$")
    public void userCreateCitizenshipWithApachePOI() {

//DataTable dek elements yerine direk.exceldeki sutuna ulaşma kodunu verdik.

     List<List<String >> liste=  ExcelUtility.getListData("src\\main\\resources\\ApacheExcel1.xlsx","testCitizen",2) ;

        for (int i = 0; i <liste.size() ; i++) {

            dialogContent.findElementAndClickFunction("addButton");
            dialogContent.findElementAndSendKeysFunction("nameInput", liste.get(i).get(0));
            dialogContent.findElementAndSendKeysFunction("shortName", liste.get(i).get(1));
            dialogContent.findElementAndClickFunction("saveButton");

            dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
        }

    }

    @Then("^User delete citizenship with ApachePOI$")
    public void userDeleteCitizenshipWithApachePOI() {

        List<List<String >> liste=  ExcelUtility.getListData("src\\main\\resources\\ApacheExcel1.xlsx","testCitizen",1);

        for (int i = 0; i <liste.size() ; i++) {

            dialogContent.editAndDeleteFunction(liste.get(i).get(0), "delete");
            dialogContent.findElementAndClickFunction("yesButton");




        }



    }
}
// silme işlemini search ile yapmayı başar. ödev.
// delete ye gecemıyor. bunu gotIt e yaptıgımız gibi yapacagız.
// fees i sen gir bilgiyi...