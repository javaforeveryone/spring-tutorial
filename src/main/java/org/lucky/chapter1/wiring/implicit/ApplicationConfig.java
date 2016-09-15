package org.lucky.chapter1.wiring.implicit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan(basePackages = "org.lucky.chapter1.wiring.implicit")
@ComponentScan(basePackageClasses = { UserServiceImpl.class })
public class ApplicationConfig {

}
