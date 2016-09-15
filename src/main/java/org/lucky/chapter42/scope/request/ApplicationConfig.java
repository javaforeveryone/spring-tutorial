package org.lucky.chapter42.scope.request;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = { UserServiceImpl.class })
public class ApplicationConfig {

}
