package springIntro;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	
	// constructor injection Tavsiye !!!
	//public CustomerManager(ICustomerDal customerDal) {
	//	this.customerDal = customerDal;
	//}
	
	// setter injection TAVSİYE BU DEĞİL !!
    public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add () {
    	// CustomerDal customerDal = new CustomerDal();
    	customerDal.add();
    }
}
