package Runners;

import Utilities.Driver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags={"@RegressionTest"},
        features = {"src\\test\\java\\FeatureFiles"},
        glue= {"StepDefinitions"},
        dryRun= false,
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                // to generate a extenT report we need this plugin
        }

)
public class _06_TestRunnerCrossBrowser extends AbstractTestNGCucumberTests{
//Artık 2. extends olamayacagı için driver sadece böyle alabilirsin.

    @BeforeClass
    @Parameters("browser2")
    public static  void beforeClass(String browser1){

       // Driver.getDriver().threadBrowserName.set(browser);// böyle olmuyor.Çunku??
        Driver.threadBrowserName.set(browser1);

    }


    @AfterClass
    public static void afterclass()
    {
        Reporter.loadXMLConfig("src\\test\\java\\XMLFiles\\extendReportSet.xml");
        Reporter.setSystemInfo("User Name ","Mustafa Aydin");
        Reporter.setSystemInfo("Application Name ","Basqar");
        Reporter.setSystemInfo("Operating System Info",System.getProperty("os.name")); // java System.getProperty ile ararsın cıkar.
        Reporter.setSystemInfo("Department","QA");
        Reporter.setSystemInfo("İstediğin Açıklamayı", "Buraya Yazarsın... ");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");




    }

}
//EN COK YAPTIGIM HATA AbstractTestNGCucumberTests i extend etmeyi unutmak.