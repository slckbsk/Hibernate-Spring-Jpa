package com.springdemo;

public class CustomerManager implements ICustomerService {

	private ICustomerDal customerDal;

   // CONSTRUCTOR INJECTION
	public CustomerManager(ICustomerDal customerDal) {
	this.customerDal = customerDal;
	}


	@Override
	public void add () {
    	// İŞ KURALLARI
    	customerDal.add();
    }
}
