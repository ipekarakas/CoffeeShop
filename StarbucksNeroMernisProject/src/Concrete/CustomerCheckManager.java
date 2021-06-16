package Concrete;

import Abstract.PersonCheckService;
import Entities.Customer;

public class CustomerCheckManager implements PersonCheckService{
	public boolean mernisControl(Customer customer) {
		
		return true;
	}

	@Override
	public boolean PersonCheckService(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}
}
