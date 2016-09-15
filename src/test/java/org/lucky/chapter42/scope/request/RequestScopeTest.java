package org.lucky.chapter42.scope.request;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
@WebAppConfiguration
public class RequestScopeTest {
	protected MockHttpServletRequest request;
	@Autowired
	protected MockHttpSession session;
	@Autowired
	private ApplicationContext applicationContext;
	@Autowired
	private UserService userService;

	@Test
	public void testRequestScope() {
		startRequest();
		UserService service1 = applicationContext.getBean(UserService.class);
		endRequest();
		startRequest();
		UserService service2 = applicationContext.getBean(UserService.class);
		endRequest();
		// Assert.assertThat(userService,
		// sameInstance(context.getBean(UserService.class)));
		// //RequestContextHolder.resetRequestAttributes();
		// RequestContextHolder.

	}

	protected void startRequest() {
		request = new MockHttpServletRequest();
		request.setSession(session);
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
	}

	protected void endRequest() {
		((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).requestCompleted();
		RequestContextHolder.resetRequestAttributes();
		request = null;
	}

}
