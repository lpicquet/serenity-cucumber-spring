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

@ContextConfiguration(classes=TestConfiguration.class)
@Component
public class MyOtherStepDefs {

    private Response response;
    @Value("${someOtherPage.url}")
    private String someOtherPage;

    @When("^I load another page$")
    public void iLoadAnotherPage() {
        response = RestRequests.given().baseUri(someOtherPage).log().all().get();
    }

    @Then("^I should get a body$")
    public void iShouldGetABody() {
        String body = response.then().extract().body().asString();
        assertNotNull("the body should not be null", body);
    }

}
