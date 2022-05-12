package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		/*
		 * ARTIK XML KALDIRDIK BU PROJEDE XML İLE İŞİMİZ BİTTİ
		 * BU KONUDA SADECE XML İLE SCAN YAPIP ANOTATION OLANLARI BULDUK
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("applicationContext.xml"); 
		*/
		
		//IocConfig java biz oluşturduk artık ordan calışacak xml den değil 
		AnnotationConfigApplicationContext context = 
		new AnnotationConfigApplicationContext(IocConfig.class);
		
		

	//	ICustomerDal customerDal = context.getBean("databaseX", ICustomerDal.class);
	//	customerDal.add();
		
		// customer service eklendikten sonra 	
		
		ICustomerService customerService = context.getBean("serviceX", ICustomerService.class);
		customerService.add();
	}

}




/*
IoC - Inversion of Control
Dependency Injection 
SOLİD yapı değiştimi eski koda dokunma
*/