package StepDefinitions;

import Pages.FromContent;
import Pages.LeftNav;
import Utilities.DBUtility;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import javax.swing.*;
import java.util.List;

public class _14_JDBCitiesSteps {
    LeftNav leftNav=new LeftNav();
    FromContent fromContent=new FromContent();

    @And("^Navigate to cities page$")
    public void navigateToCitiesPage(DataTable elements) {
       List<String > clickElements=elements.asList(String.class);
        for (int i = 0; i <clickElements.size() ; i++) {
            leftNav.findElementAndClickFunction(clickElements.get(i));
        }


    }

    @And("^Send The Query the database \"([^\"]*)\" and control match$")
    public void sendTheQueryTheDatabaseAndControlMatch(String query) {


        List<List<String >> dbList= DBUtility.getListData(query);
        List<WebElement> citiesList=fromContent.listCities;

        for (int i = 0; i <dbList.size() ; i++) {

            System.out.println("db--> "+dbList.get(i).get(1)+" :: "+citiesList.get(i).getText()+" <--ui ");
            Assert.assertEquals(dbList.get(i).get(1),citiesList.get(i).getText());


        }










    }
}
