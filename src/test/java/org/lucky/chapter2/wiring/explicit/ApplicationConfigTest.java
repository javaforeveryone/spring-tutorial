package org.lucky.chapter2.wiring.explicit;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lucky.chapter1.wiring.implicit.ApplicationConfig;
import org.lucky.chapter1.wiring.implicit.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = ApplicationConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationConfigTest {
	@Autowired
	private UserService userService;

	@Test
	public void testUserService() {
		assertNotNull(userService);
	}
}
