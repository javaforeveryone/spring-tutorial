package org.lucky.chapter31.wiring.conditional;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

@Configuration
public class ConditionalApplicationContext {
	@Bean(destroyMethod = "shutdown")
	@DevProfile
	@Conditional(DevProfileConditionExists.class)
	public DataSource devDataSource() {
		return new EmbeddedDatabaseBuilder().build();
	}

}
