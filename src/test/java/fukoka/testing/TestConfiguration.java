package fukoka.testing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:test.properties")
@ComponentScan(basePackages = "fukoka.testing")
public class TestConfiguration {

}
