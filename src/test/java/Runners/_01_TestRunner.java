package Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
/**
 * Runner Classlar ne için kullanılır: Belirli veya grupladığımı testleri toplu olarak çalıştırma imkanı veriri.
 * Bunun için;
 * 1- Java Class açılır.
 * 2- AbstractTestNGCucumberTests  extend alınır.Böylece RUN özelliği kazanır
 * 3- Class a   @CucumberOptions annotition ı eklenrek , buraya parametreleri verilerek kullanılır.
 *
 * Genel olarak TestNG deki XML i olarak düşünebilirsiniz.
 *
 * SmokeTest : En genel manada ana unsurları test etme.
 * RegressionTest : Bütün birimleri uyumlu şekilde çalışma test
 */
@CucumberOptions(
        features = {"src\\test\\java\\FeatureFiles"}, // buraya feture nin yolunu-path- verilecek
        glue= {"StepDefinitions"},//Step definetions un clasöru yazılacak.
        dryRun=false// true olduğunda testi çalıştırmaz sadece feature lara ait steplerin varlığını kontrol eder.
        // false olduğunda ise testi çalıştırır.

)
public class _01_TestRunner extends AbstractTestNGCucumberTests { //Böylece RUN özelliği kazanır


}
/*
    glue(gluu)::Tutkal
    dry Run=prova,tatbikat
    Abstract=Öz-Özet

 */