package org.lucky.chapter3.wiring.profile;

import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "applicationContext.xml")
@ActiveProfiles("dev")
public class DevIntegrationTestWithXML {
	@Autowired
	private DataSource dataSource;

	@Test
	public void testDataCource() {
		assertNotNull(dataSource);
	}
}
