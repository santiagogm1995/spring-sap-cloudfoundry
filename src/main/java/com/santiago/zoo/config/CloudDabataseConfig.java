package com.santiago.zoo.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@Profile("cloud")
public class CloudDabataseConfig extends AbstractCloudConfig {
	
	@Bean
	public DataSource dataSource(@Value("${spring.datasource.url}")final String url,
			@Value("${spring.datasource.username}")final String user,
			@Value("${spring.datasource.password}")final String password) {
		
		
		return DataSourceBuilder.create()
				.type(HikariDataSource.class)
				.driverClassName(com.sap.db.jdbc.Driver.class.getName())
				.url(url)
				.username(user)
				.password(password)
				.build();	

	}
}