package Adapters;
import java.rmi.RemoteException;
import java.util.Locale;


import Abstract.PersonCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService {
		public boolean PersonCheckService(Customer customer) {
			KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
			
			return proxy.TCKimlikNoDogrula(customer.setNationalId(0), customer.getFirtName(), customer.getFirtName(), customer.getDateOfBirth());
			}
}
