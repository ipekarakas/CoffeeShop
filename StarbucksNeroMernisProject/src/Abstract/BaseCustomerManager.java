package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	public BaseCustomerManager() {
		Customer customer =new Customer();
		
		System.out.println("Saved to db"+customer.getFirtName());
	}

	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
