package org.lucky.chapter43.scope.session;

import static org.hamcrest.CoreMatchers.sameInstance;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
@WebAppConfiguration
public class SessionScopeTest {
	@Autowired
	private MockHttpServletRequest request;
	@Autowired
	private MockHttpSession session;
	@Autowired
	private ApplicationContext context;
	@Autowired
	private UserService userService;

	@Test
	public void testSessionScope() {
		Assert.assertThat(userService, sameInstance(context.getBean(UserService.class)));

	}

}
