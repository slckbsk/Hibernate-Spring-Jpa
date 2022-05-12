package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		//CustomerManager customerManager = new CustomerManager(context.getBean("database", ICustomerDal.class)); // Dependency Injection 
		//customerManager.add();
		customerService.add();
	}

}




/*
IoC - Inversion of Control
Dependency Injection 
SOLİD yapı değiştimi eski koda dokunma
*/