package configfilereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import managers.FileReaderManager;
import testdatatypes.Customer;

public class JsonDataReader {
	
	private final String customerFilePath= FileReaderManager.getInstance().getConfigFileReader().getTestDataResourcesPath() + "Customer.json";
	private List<Customer> customerList;
	
	
	public JsonDataReader() {
		customerList = getCustomerData();
	}


	private List<Customer> getCustomerData() {

		Gson gson = new Gson();
		BufferedReader bufferedreader = null;
		
		try {
			
			bufferedreader=new BufferedReader(new FileReader(customerFilePath));
			Customer[] customers=gson.fromJson(bufferedreader, Customer[].class);
			return Arrays.asList(customers);
			
		}
		catch(Exception e) {
			throw new RuntimeException("Json file not found at path : " + customerFilePath);

		}
		
		//return null;
	}
	
	public final Customer getCustomerByName(String customerName) {
		for(Customer customer:customerList) {
			if(customer.firstName.equalsIgnoreCase(customerName)) return customer;
		}
		return null;
	}
	
	
	

}
