package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springdemo")
@PropertySource("classpath:values.properties")
public class IocConfig {

	@Bean
	public ICustomerDal databaseX() {
		return new SqlServerCustomerDal();
	}

	@Bean
	public ICustomerService serviceX () {
		return new CustomerManager(databaseX());
	}

}
