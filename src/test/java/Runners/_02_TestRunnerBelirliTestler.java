package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
/** SADECE BU FİLES TEST YAP DERSEN ;
 *
 * Aşağıdaki opsionda çalıştırmak istediğimi FEATURE filelerın
 * (Copy-->> Copy Path-->> Path From Content Root) ile alınıp,
 * pathleri verilerek sadece onlar çalıştırıldı
 */

@CucumberOptions
        (features = {"src\\test\\java\\FeatureFiles\\_01_Login.feature", "src\\test\\java\\FeatureFiles\\_05_SenaryoOutlineCitizenShip.feature"},
        glue= {"StepDefinitions"},
        dryRun= false
)
public class _02_TestRunnerBelirliTestler  extends AbstractTestNGCucumberTests {

}

//Sadece adını alacaksan--->> Copy Referance ile alırsın.