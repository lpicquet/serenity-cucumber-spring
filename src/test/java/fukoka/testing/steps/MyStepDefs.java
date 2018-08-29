package fukoka.testing.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fukoka.testing.TestConfiguration;
import io.restassured.response.Response;
import net.serenitybdd.rest.RestRequests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertNotNull;

@ContextConfiguration(classes = TestConfiguration.class)
@Component
public class MyStepDefs {

    @Autowired
    MyOtherStepDefs myOtherStepDefs;

    @Value("${google.url}")
    private String googleUrl;

    private Response response;

    @When("^I load the home page of Google$")
    public void iLoadTheHomePageOfGoogle() {
        response = RestRequests.given().baseUri(googleUrl).log().all().get();
    }

    @Then("^I should get a (\\d+) response$")
    public void iShouldGretAResponse(int responseCode) {
        response.then().statusCode(responseCode);
    }


    @And("^Injection should work$")
    public void injectionShouldWork() {
        assertNotNull("my other step defs should not be null", myOtherStepDefs);
    }
}
