package Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Aşağıdaki seçenekde tags eklendi içinde grup adına
 * sahip senaryolar çalıştıralacak sadece
 */

@CucumberOptions(
        tags={"@SmokeTest"},
        features = {"src\\test\\java\\FeatureFiles"},
        glue= {"StepDefinitions"},
        dryRun= false

// buradaki sıralamanın bı önemı yok. değişebilir
)
public class _03_TestRunnerSmokeTest extends AbstractTestNGCucumberTests {

}

