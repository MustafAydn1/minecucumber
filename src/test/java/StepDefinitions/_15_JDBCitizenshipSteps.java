package StepDefinitions;

import Pages.FromContent;
import Utilities.DBUtility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _15_JDBCitizenshipSteps {
    @And("^Check control ui and db list on citizenship page with \"([^\"]*)\" query$")
    public void checkControlUiAndDbListOnCitizenshipPageWithQuery(String query)  {

        List<List<String>> dblist= DBUtility.getListData(query);

        FromContent fromContent=new FromContent();
        List<WebElement> uiList=fromContent.listCitizenship;

        for (int i = 0; i <dblist.size() ; i++) {
            System.out.println("ui --> "+uiList.get(i).getText()+" : "+dblist.get(i).get(1)+" <-- db" );
            Assert.assertEquals(uiList.get(i).getText(),dblist.get(i).get(1));

        }



    }
}
