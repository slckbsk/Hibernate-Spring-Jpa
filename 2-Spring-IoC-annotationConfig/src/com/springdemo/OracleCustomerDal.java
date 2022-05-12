package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

/* import org.springframework.stereotype.Component;
 @Component("database") BUNUDA IoCconfigte
 bean yazarak kullanma ihtiyacımız kalmıyor
 hangi veritabanı ile calışıyorsak bu annotationu
 o clasta kullanıyorduk scanda buluyor işlem görüyordu
 */


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
