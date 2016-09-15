package org.lucky.chapter50.propertyload;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class PropertyLoadTest {
	@Autowired
	private Environment environment;

	@Test
	public void testLoadProperty() {
		assertEquals("lucky", environment.getProperty("my.name"));
		assertEquals("reading", environment.getProperty("my.hobby"));
	}
}
