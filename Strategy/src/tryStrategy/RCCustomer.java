package tryStrategy;

public class RCCustomer extends Customer {

	public RCCustomer(String id, String name) {
		super(id, name);
		this.d=new RCDiscount();
		typeOfCust="Regular Customer";
		
		// TODO Auto-generated constructor stub
	}

}
