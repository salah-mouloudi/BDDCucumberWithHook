package tdBankBase;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/Resources/tdBankFeatures/TDbank.feature"},
        glue = {"tdBankBase","TDBankStepDefinitions"},
        plugin ={"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports/report.html"},
//        stepNotifications = true,
        monochrome=true,
        dryRun=false,
        tags=""
// tags = " (@SmokeTest or @Regression) and not @pending"
// tags = "(@SmokeTest or @Regression) and (not @pending)"
// tags = {"@SmokeTest or @Regression and not @pending"}
)


public class TDBankTestRunner {

}
