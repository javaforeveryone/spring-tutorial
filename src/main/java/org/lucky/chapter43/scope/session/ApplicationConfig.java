package org.lucky.chapter43.scope.session;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = { UserServiceImpl.class })
public class ApplicationConfig {

}
