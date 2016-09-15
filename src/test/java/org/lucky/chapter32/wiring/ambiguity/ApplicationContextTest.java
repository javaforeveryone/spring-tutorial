package org.lucky.chapter32.wiring.ambiguity;

import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = ApplicationContext.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationContextTest {
	@Autowired
	private DataSource dataSource;

	@Test
	public void testDataCource() {
		assertNotNull(dataSource);
	}
}
