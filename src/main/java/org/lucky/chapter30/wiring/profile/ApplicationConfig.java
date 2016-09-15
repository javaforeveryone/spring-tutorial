package org.lucky.chapter30.wiring.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
public class ApplicationConfig {

	@Bean(destroyMethod = "shutdown")
	@Profile(value = "dev")
	public DataSource getEmbeddedDataSource() {
		return new EmbeddedDatabaseBuilder().build();
	}

	@Bean(destroyMethod = "shutdown")
	@Profile("prod")
	public DataSource getJndiDataSource() {
		JndiObjectFactoryBean jndi = new JndiObjectFactoryBean();
		jndi.setJndiName("comp:/testDataSource");
		jndi.setResourceRef(true);
		jndi.setProxyInterface(DataSource.class);
		return (DataSource) jndi.getObject();
	}
}
