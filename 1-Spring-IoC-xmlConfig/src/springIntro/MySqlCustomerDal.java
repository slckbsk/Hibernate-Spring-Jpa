package springIntro;

public class MySqlCustomerDal implements ICustomerDal {

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
		System.out.println("MySql veritabanına eklendi");
	}

}
