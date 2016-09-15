package org.lucky.chapter32.wiring.ambiguity;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

public class ApplicationContext {
	@Bean(destroyMethod = "shutdown")
	@Primary
	public DataSource devDataSource1() {
		return new EmbeddedDatabaseBuilder().build();
	}

	@Bean(destroyMethod = "shutdown")
	public DataSource devDataSource2() {
		return new EmbeddedDatabaseBuilder().build();
	}
}
