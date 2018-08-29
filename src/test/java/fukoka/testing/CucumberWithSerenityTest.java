package fukoka.testing;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

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
@ContextConfiguration(classes = TestConfiguration.class)
public class CucumberWithSerenityTest {
    @ClassRule
    public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

    @Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();
}
