package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends _Parent {

    public LeftNav() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement country;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenships;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationality;

    @FindBy(xpath = "//span[text()='Inventory']")
    private WebElement Inventory;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setupButtonUnderInventory;

    @FindBy(xpath = "//span[text()='Item Categories']")
    private WebElement ItemCategory;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
     private  WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
     private WebElement  entranceExams;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement examSetup;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement  entranceExams2;

    @FindBy(xpath = "//span[text()='Student']")
    public WebElement student;

    @FindBy(xpath = "//span[text()='Students']")
    public WebElement students;

    @FindBy(xpath = "(//span[text()='Cities'])[1]")
    private  WebElement cities;




    WebElement myElement;
    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "setupOne":
                myElement = setupOne;
                break;

            case "parameters":
                myElement = parameters;
                break;

            case "country":
                myElement = country;
                break;

            case "citizenships":
                myElement = citizenships;
                break;

            case "nationality":
                myElement = nationality;
                break;

            case "Inventory":
                myElement = Inventory;
                break;

            case "setupButtonUnderInventory":
                myElement = setupButtonUnderInventory;
                break;

            case "ItemCategory":
                myElement = ItemCategory;
                break;




            case "fees":
                myElement = fees;
                break;

            case "entranceExams":
                myElement = entranceExams;
                break;

            case "examSetup":
                myElement = examSetup;
                break;

            case "entranceExams2":
                myElement = entranceExams2;
                break;

            case "student":
                myElement=student;
                break;

            case "students":
                myElement=students;
                  break;

            case "cities":
                myElement=cities;
                break;

        }

        clickFunction(myElement);
    }
}
