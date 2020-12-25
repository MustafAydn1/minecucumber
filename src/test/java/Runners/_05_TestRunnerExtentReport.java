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
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReportNasılKurulur/ExtentReportRegression.html"
                // to generate a extenT report we need this plugin
        }

)
public class _05_TestRunnerExtentReport extends AbstractTestNGCucumberTests {


    @BeforeClass
    @Parameters("browser")
    public static  void beforeClass(String browser){

        Driver.threadBrowserName.set("Chrome");
    }


    @AfterClass
    public static void afterclass()
    {
        Reporter.loadXMLConfig("src\\test\\java\\XMLFiles\\extendReportSet.xml");
        //extentReportSet.xml ile  clasımızın bagını kurduk?..
        Reporter.setSystemInfo("User Name ","Mustafa Aydin");
        Reporter.setSystemInfo("Application Name ","Basqar");
        Reporter.setSystemInfo("Operating System Info",System.getProperty("os.name"));
        // java System.getProperty ile ararsın cıkar.İşletim sistemının ne oldugunu anlarsın.Win10-mac-linux..
        Reporter.setSystemInfo("Department","QA"); // QUALİTY Assurance:: kalite kontrol:: eşşuurıns
        Reporter.setSystemInfo("İstediğin Açıklamayı", "Buraya Yazarsın... ");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");//execution::exıkuujın::Uygulamak

        //CEO::(Chief Executive Officer)::baş yonetici-uygulayıcı.




    }


}



