package org.lucky.chapter41.scope.prototype;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = { UserServiceImpl.class })
public class ApplicationConfig {

}
