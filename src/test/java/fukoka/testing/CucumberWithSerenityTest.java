package fukoka.testing;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin =
         {
                 "pretty",
                 "json:build/reports/cucumber-json-report.json",
                 "junit:build/reports/junit-test-report.xml",
                 "html:build/reports/cucumber-html-reports"
         },
         glue = { "fukoka.testing.steps"},
         features = {"classpath:features"},
         strict = true,
         tags = "not @ignore"
)
public class CucumberWithSerenityTest {
}
