package org.lucky.chapter40.scope.singleton;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class SingletonScopeTest {
	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testSingleton() {
		UserService service1 = applicationContext.getBean(UserService.class);
		UserService service2 = applicationContext.getBean(UserService.class);
		boolean isServiceEqual = false;
		if (service1 == service2) {
			isServiceEqual = true;
		}
		assertTrue(isServiceEqual);
	}
}
