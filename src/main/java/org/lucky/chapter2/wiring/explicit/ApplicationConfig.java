package org.lucky.chapter2.wiring.explicit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @Import(value=ApplicationConfigTest.class)
public class ApplicationConfig {
	// @Bean(name = "userDao")
	@Bean
	public UserDao getUserDao() {
		return new UserDaoImpl();
	}

	// @Bean
	// public UserService getUserService() {
	// return new UserServiceImpl(getUserDao());
	// }

	@Bean
	public UserService getUserService(UserDao userDao) {
		return new UserServiceImpl(userDao);
	}

}
