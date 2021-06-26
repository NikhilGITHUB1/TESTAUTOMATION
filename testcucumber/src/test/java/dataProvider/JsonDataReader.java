package dataProvider;
	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Arrays;
	import java.util.List;
	import com.google.gson.Gson;

import testDataTypes.PojoCustomer;
	
	
public class JsonDataReader {
	private final String customerFilePath = FileReaderManager.getInstance().getConfigFileReader().getTestDataResourcePath() + "Customer.json";
	private List<PojoCustomer> customerList;
	
	public JsonDataReader(){
		customerList = getCustomerData();
	}
	
	private List<PojoCustomer> getCustomerData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(customerFilePath));
			PojoCustomer[] customers = gson.fromJson(bufferReader, PojoCustomer[].class);
			return Arrays.asList(customers);
		}catch(FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + customerFilePath);
		}finally {
			try { if(bufferReader != null) bufferReader.close();}
			catch (IOException ignore) {}
		}
	}
		
	public final PojoCustomer getCustomerByName(String customerName){
		for(PojoCustomer customer : customerList) {
			if(customer.firstName.equalsIgnoreCase(customerName)) return customer;
		}
		return null;
	}
	

}