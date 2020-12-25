package StepDefinitions;

import Utilities.Driver;
import Utilities.ExcelUtility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _04_Hooks { // yani bütün senaryolara kanca atar gibi, öncesinde ve sonrasınd açalışıyor.

    @Before   // her senaryodan önce
    public void before(Scenario scenario)
    {
        System.out.println("Senaryo Başladı");
        System.out.println("senaryonun id si= "+scenario.getId());
        System.out.println("senaryonun adı= "+scenario.getName());
    }

    @After  // her senaryodan sonra
    public void after(Scenario scenario)
    {
        System.out.println("Senaryo bitti");
        System.out.println("senaryonun sonucu= "+ scenario.getStatus());
        // en son çıkmadan ekranı görelim diye bilerek koyduk

        Date now= new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH_mm_ss");//istediğim formatı oluşturdum.
        String strDate=formatter.format(now);// şu anki zamanı istediğim formata dönusturdum.
        System.out.println(strDate);

        if(scenario.getStatus()=="failed")
        {
            String scenarioName=scenario.getName();



            TakesScreenshot ts= (TakesScreenshot) Driver.getDriver();
            File ekranDosyasi=ts.getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(ekranDosyasi,new File("target/FailedScreenShot/"+
                                                         Driver.threadBrowserName.get()+scenarioName+strDate+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
//copyFile daki kırmızılık more action dan try-catch oluşturulur. hata verme ihtimali var. dosyayı bulamazsa..
        }

        ExcelUtility.exceleYaz(scenario,strDate,Driver.threadBrowserName.get());



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       // Driver.quitDriver();
    }
}
