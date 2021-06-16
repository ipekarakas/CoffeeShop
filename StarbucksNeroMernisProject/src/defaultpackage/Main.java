package defaultpackage;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Customer ipek = new Customer(1,"ipek","kara","01/01/1980","123456");
		
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager();
        @SuppressWarnings("unused")
		NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
        starbucksCustomerManager.save(ipek);
	}

}
