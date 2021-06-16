package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.PersonCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements PersonCheckService{
	
	 private PersonCheckService customerCheckService;
	 
	 
	 public void save(Customer customer) {
	if(customerCheckService.PersonCheckService(customer)) {
		super.save(customer);
	}else {
		System.out.println("Not a valid person");
	}
	 }


	@Override
	public boolean PersonCheckService(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}
}
