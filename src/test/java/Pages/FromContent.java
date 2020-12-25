package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FromContent extends _Parent{

    WebElement myElement;

    public FromContent(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//ms-text-field//input")
    public WebElement examName;

    @FindBy(xpath = "(//span[text()='Academic Period'])[1]")
    public WebElement academicPeriod;

    @FindBy(xpath = "(//mat-option[@role='option'])[1]")
    public WebElement option1;

    @FindBy(xpath = "(//mat-option[@role='option'])[2]")
    public WebElement option2;

    @FindBy(xpath = "(//mat-option[@role='option'])[3]")
    public WebElement option3;

    @FindBy(xpath = "(//mat-option[@role='option'])[4]")
    public WebElement option4;


    @FindBy(xpath = "(//span[text()='Grade Level'])[1]")
    public WebElement gradeLevel;


   // @FindBy(xpath = "//span[text()=' whiteN ']")
   // public WebElement gradeLevelSlc;

    @FindBy(xpath = "(//span[text()='Document Type'])[1]")
    public WebElement documentType;

   // @FindBy(xpath = "//span[text()=' Свидетельство о рождении ']")
   // public WebElement documentTypeSlc;


    @FindBy(xpath = "//span[text()='Add']")
    public WebElement addExams;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveExams;



    @FindBy(css = "ms-text-field[formcontrolname='firstName']>input")
    public WebElement firstname;

    @FindBy(css = "ms-text-field[formcontrolname='lastName']>input")
    public WebElement lastname;

    @FindBy(xpath="(//span[text()='Gender'])[1]")
    public WebElement gender;

    @FindBy(xpath="(//span[text()=' Male '])[1]")
    public WebElement male;

    @FindBy(xpath="(//span[text()='Grade Level'])[1]")
    public WebElement stdntGradeLevel;

    @FindBy(xpath="//span[text()=' whiteN ']")
    public WebElement whiteN;

    @FindBy(xpath="(//span[text()='School Department'])[1]")
    public WebElement schlDepartmn;

    @FindBy(xpath="(//span[text()=' Лицей '])[1]")
    public WebElement schlDprtmn1;

    @FindBy(xpath="(//span[text()='Section'])[1]")
    public WebElement section;

    @FindBy(xpath="(//span[text()=' Бастауыш мектеп - Начальная школа '])[1]")
    public WebElement section1;

    @FindBy(xpath="(//span[text()='Citizenship'])[1]")
    public WebElement citizenship;

    @FindBy(xpath="(//span[text()=' Kazakhstan '])[1]")
    public WebElement citizenship1;

    @FindBy(xpath="(//span[text()='Document Type'])[1]")
    public WebElement sDocumentType;

    @FindBy(xpath="(//span[text()=' Personal ID '])[1]")
    public WebElement personalID;

    @FindBy(xpath="//input[@formcontrolname='documentNumber']")
    public WebElement documentNumber;

    @FindBy(xpath="//div[text()='Representatives']")
    public WebElement representatives;

    @FindBy(xpath="(//ms-add-button//button)[2]")
    public WebElement btnAdd;

    @FindBy(xpath="(//span[text()='Representative'])[2]")
    public WebElement representive;

    @FindBy(xpath = "//span[text()=' Mother '] ")
    private WebElement repSelect1;

    @FindBy(xpath="//input[@formcontrolname='firstName']")
    public WebElement repfirstname;

    @FindBy(xpath="//input[@formcontrolname='lastName']")
    public WebElement replastname;

    @FindBy(xpath="//input[@formcontrolname='phone']")
    public WebElement repPhone;

    @FindBy(xpath="//span[text()='Kazakhstan']")
    public WebElement repCountry;

    @FindBy(xpath="//span[text()=' Add ']")
    public WebElement repAdd;

    @FindBy(xpath = "//ms-save-button//button")
    public WebElement saveButton;


    @FindAll({
            @FindBy(xpath = "//tbody[@role='rowgroup']/tr/td[2]")
    })
    public List<WebElement> listCities;

    @FindAll({
            @FindBy(xpath = "//tbody/tr/td[2]")
    })
    public List<WebElement> listCitizenship;


    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {

            case "repSelect1":
                myElement = repSelect1;
                break;

            case "repCountry":
                myElement = repCountry;
                break;

            case "repAdd":
                myElement = repAdd;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "representatives":
                myElement = representatives;
                break;

            case "btnAdd":
                myElement = btnAdd;
                break;

            case "representive":
                myElement = representive;
                break;

            case "sDocumentType":
                myElement = sDocumentType;
                break;

            case "personalID":
                myElement = personalID;
                break;


            case "academicPeriod":
                myElement = academicPeriod;
                break;

            case "option1":
                myElement = option1;
                break;

            case "option2":
                myElement = option2;
                break;

            case "option3":
                myElement = option3;
                break;

            case "option4":
                myElement = option4;
                break;

            case "gradeLevel":
                myElement = gradeLevel;
                break;

            case "documentType":
                myElement = documentType;
                break;

            case "addExams":
                myElement = addExams;
                break;

            case "saveExams":
                myElement = saveExams;
                break;

            case "gender":
                myElement = gender;
                break;

            case "male":
                myElement = male;
                break;

            case "stdntGradeLevel":
                myElement = stdntGradeLevel;
                break;

            case "whiteN":
                myElement = whiteN;
                break;

            case "schlDepartmn":
                myElement = schlDepartmn;
                break;

            case "schlDprtmn1":
                myElement = schlDprtmn1;
                break;

            case "section":
                myElement = section;
                break;

            case "section1":
                myElement = section1;
                break;

            case "citizenship":
                myElement = citizenship;
                break;

            case "citizenship1":
                myElement = citizenship1;
                break;


        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "examName":
                myElement = examName;
                break;

            case "firstname":
                myElement = firstname;
                break;

            case "lastname":
                myElement = lastname;
                break;

            case "documentNumber":
                myElement = documentNumber;
                break;

            case "repfirstname":
                myElement = repfirstname;
                break;

            case "replastname":
                myElement = replastname;
                break;

            case "repPhone":
                myElement = repPhone;
                break;

        }

        sendKeysFunction(myElement,value);
    }

}
