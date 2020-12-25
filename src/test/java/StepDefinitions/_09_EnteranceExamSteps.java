package StepDefinitions;

import Pages.FromContent;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _09_EnteranceExamSteps {

    FromContent fromContent=new FromContent();

//BU SYNTAX LARIN MANTIGINI ANLA!!!

    @And("^Click on the element in the content classs$")
    public void clickOnTheElementInTheContentClasss(DataTable elements) {

     List<String> elementsToClick=elements.asList(String.class);


        for (int i = 0; i <elementsToClick.size() ; i++) {
            System.out.println(elementsToClick.get(i));
            fromContent.findElementAndClickFunction(elementsToClick.get(i));

        }




    }

    @When("^User sending the keys in the dialog content classs$")
    public void userSendingTheKeysInTheDialogContentClasss(DataTable elements) {

        List<List<String>> elementsNameAndValue=elements.asLists(String.class);

        for (int i = 0; i <elementsNameAndValue.size() ; i++) {
            System.out.println(elementsNameAndValue);

            fromContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));
        }




    }
}
