package org.lucky.chapter3.wiring.conditional;

import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lucky.chapter31.wiring.conditional.ConditionalApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConditionalApplicationContext.class)
public class ConditionalApplicationContextTest {
	@Autowired
	private DataSource dataSource;

	@Test
	public void testDataCource() {
		assertNotNull(dataSource);
	}

}
