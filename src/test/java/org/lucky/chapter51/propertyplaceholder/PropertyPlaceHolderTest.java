package org.lucky.chapter51.propertyplaceholder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class PropertyPlaceHolderTest {
	@Autowired
	private UserService service;

	@Test
	public void testPropertyplaceHolderConfigurer() {
		assertEquals("lucky", service.getName());
		assertEquals("reading", service.getHobby());
	}
}
