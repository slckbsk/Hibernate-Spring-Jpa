package com.springdemo;

import org.springframework.beans.factory.annotation.Value;


public class OracleCustomerDal implements ICustomerDal {

	@Value("${database.connectionString}")
	String connectionConfig; // her veri tabının farklı

	public String getconnectionConfig() {
		return connectionConfig;
	}

	public void setconnectionConfig(String connectionConfig) {
		this.connectionConfig = connectionConfig;
	}

	@Override
	public void add() {
		System.out.println("Connection config : " + this.connectionConfig);

		System.out.println("Oracle veritabanına eklendi");
	}


}
