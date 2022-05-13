package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		/*
		 * 
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		ICustomerDal customerDal = context.getBean("databaseX", ICustomerDal.class);
		customerDal.add();
		*/
	
		
		// BU KONUDA SADECE XML İLE SCAN YAPIP ANOTATION OLANLARI BULDUK
		// IocConfig.class biz oluşturduk artık ordan calışacak xml den değil 
		AnnotationConfigApplicationContext context = 
		new AnnotationConfigApplicationContext(IocConfig.class);
		
		
		// customer service eklendikten sonra 	
		ICustomerService customerService = context.getBean("serviceX", ICustomerService.class);
		customerService.add();
	}

}


