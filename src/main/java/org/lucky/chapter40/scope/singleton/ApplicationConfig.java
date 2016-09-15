package org.lucky.chapter40.scope.singleton;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = { UserServiceImpl.class })
public class ApplicationConfig {

}
