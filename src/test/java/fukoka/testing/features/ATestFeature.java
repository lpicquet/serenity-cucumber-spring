package fukoka.testing.features;

import fukoka.testing.TestConfiguration;
import fukoka.testing.TestContext;
import fukoka.testing.steps.MyOtherStepDefs;
import fukoka.testing.steps.MyStepDefs;
import net.thucydides.core.annotations.Steps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestConfiguration.class)
public class ATestFeature {

    @Autowired
    TestContext testContext;

    @Steps
    MyStepDefs myStepDefs;

    @Steps
    MyOtherStepDefs myOtherStepDefs;


}
