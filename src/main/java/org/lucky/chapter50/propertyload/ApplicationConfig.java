package org.lucky.chapter50.propertyload;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/org/lucky/chapter50/propertyload/test.properties")
public class ApplicationConfig {

}
