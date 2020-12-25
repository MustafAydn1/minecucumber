package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _08_DataTableSteps {
    DialogContent dialogContent=new DialogContent();
    LeftNav leftNav=new LeftNav();


    @And("^Click on the element in the content class$")
    public void clickOnTheElementInTheContentClass(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i <elementsToClick.size() ; i++) {
            System.out.println(elementsToClick.get(i));


            dialogContent.findElementAndClickFunction(elementsToClick.get(i));

        }


    }

    @When("^User sending the keys in the dialog content class$")
    public void userSendingTheKeysInTheDialogContentClass(DataTable elements) {
// bırden cok için denemeler yaptım olmadı..


       List< List<String> > elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i <elementsNameAndValue.size() ; i++) {
       //     System.out.println(elementsNameAndValue.get(i).get(0)); // elemanın adı
       //     System.out.println(elementsNameAndValue.get(i).get(1)); // elemanın gönderilecek değeri

//             | nameInput | ismetCountry |    elementsNameAndValue.get(i).get(0)   i.satırdaki 0.eleman yani nameInput,
//                                             elementsNameAndValue.get(i).get(1)   i.satırdaki 1.eleman yani ismetCountry,
//             | codeInput | 123          |    elementsNameAndValue.get(i).get(0)   i.satırdaki 0.eleman yani codeInput,
//                                             elementsNameAndValue.get(i).get(1)   i.satırdaki 1.eleman yani 123,
            /*
            for (int j = 1; j<elementsNameAndValue.get(i).size()  ; j++) {

                dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(j));
            }

            // [[ nameInput , ismetCountry ] ,[ codeInput , 123  ]]
             */


            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));

           // dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(2));
           // dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(3));

// en sonuncu da save yepıyor. herbiri için nasılsave yaparız.
//buraya koysam code yı gırmeden save yapıyor.

    }

    }

    @And("^Click on the element in the left class$")
    public void clickOnTheElementInTheLeftClass(DataTable elements) {

        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i <elementsToClick.size() ; i++) {

            System.out.println(elementsToClick.get(i));

            leftNav.findElementAndClickFunction(elementsToClick.get(i));

        }



    }
}
 // buradaki sıralamanın önemi yok. önemli olan feature deki sıralama....