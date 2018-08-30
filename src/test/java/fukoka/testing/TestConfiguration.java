package fukoka.testing;

import fukoka.testing.steps.MyStepDefs;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/application.properties")
@ComponentScan(basePackageClasses = MyStepDefs.class)
public class TestConfiguration {

}
