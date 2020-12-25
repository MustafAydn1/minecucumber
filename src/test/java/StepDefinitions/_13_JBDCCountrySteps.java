package StepDefinitions;

import Pages.DialogContent;
import Pages._Parent;
import Utilities.DBUtility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _13_JBDCCountrySteps {

    @Then("^Send The query the database \"([^\"]*)\" and control match$")
    public void sendTheQueryTheDatabaseAndControlMatch(String query)  {

        // DB deki country tablosundaki isimler UI da gözüküyor mu?
        List<List<String>> dbList = DBUtility.getListData(query);

        DialogContent dialogContent=new DialogContent(); // dialogContent.nameList elementine ulaşmak için tanımlandı.
        // UI daki ülke listesi alındı
       // List<WebElement> uiList = dialogContent.waitVisibleListAllElement(dialogContent.nameList);
        List<WebElement> uiList=dialogContent.nameList;

        for(int i=0; i < dbList.size(); i++) // db deki kadar karşılaştırma yaptırdık
        {


                System.out.println("db:"+dbList.get(i).get(1) + " - ui:"+ uiList.get(i).getText());

                Assert.assertEquals(dbList.get(i).get(1), uiList.get(i).getText());


  //BUNA UGRAŞ. 4 ULKEYİ TUM  LİSTEDE  ARAMA YAP... ÇİFT FOR İLE..

            // dbList.get(i).get(1)  -> her satırın 1 indexli elemanı alındı.
            // uiList.get(i)   -> UI daki sadece country isimleri alındaı
            // ve karşılaştırıldı.
        }
    }
}






/*

    @And("^Send the Query database \"([^\"]*)\" and control match$")
    public void sendTheQueryDatabaseAndControlMatch(String query)  {
//Burada cıkan String;feature deki "" kısımdan geldi. Yani bizim sorgumuz olmuş oldu.


        // DB deki country tablosundaki isimler UI da gözüküyor mu?
        List<List<String>> dbList = DBUtility.getListData(query);

      DialogContent dialogContent=new DialogContent();// dialogContent.nameList elementine ulaşmak için tanımlandı.

        // UI daki ülke listesi alındı.
       // List<WebElement> uiList=_parent.waitVisibleListAllElement(new DialogContent().nameList);
        List<WebElement> uiList=dialogContent.nameList;

        System.out.println(dbList);
        System.out.println(uiList);

        for (int i = 0; i <dbList.size() ; i++) {// db deki kadar karşılaştırma yaptırdık

            System.out.println("ui- "+uiList.get(i).getText()+" -->  db -"+ dbList.get(i).get(1));

            Assert.assertEquals(dbList.get(i).get(1),uiList.get(i).getText());

            // dbList.get(i).get(1)  -> her satırın 1 indexli elemanı alındı.
            // uiList.get(i)   -> UI daki sadece country isimleri alındaı
            // ve karşılaştırıldı.

        }



    }
 */