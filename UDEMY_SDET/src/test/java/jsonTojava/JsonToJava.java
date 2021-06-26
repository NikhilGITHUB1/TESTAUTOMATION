package jsonTojava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.commons.lang3.StringEscapeUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JsonToJava {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, JsonGenerationException, JsonMappingException, IOException {
		

		ArrayList<CustomerDetails> a = new ArrayList<CustomerDetails>();
		JSONArray js=new JSONArray();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business","root","maya@786");
		
		Statement st=conn.createStatement();
		ResultSet rs = st.executeQuery("select * from CustomerInfo where location='Asia' and purchasedDate=curDate()");
		
		while(rs.next()){
			
			CustomerDetails c =new CustomerDetails();

			c.setCourseName(rs.getString(1));
			c.setPurchasedDate(rs.getString(2));	
			c.setAmount(rs.getInt(3));
			c.setLocation(rs.getString(4));
			
			System.out.println(c.getCourseName());
			System.out.println(c.getPurchasedDate());
			
			a.add(c);

//			System.out.println(rs.getInt(3));
//			System.out.println(rs.getString(4));

			
			
		}
		
		//Before this:
		//1> Using jackson api Object Mapper class we are converting the java object to json
		//2> 3 json gets generated for 3 object inputs
		//3> Using the object mapper write value class we are converting each object to 3 separate json
		//4> Our agenda is to create a single json
		
		// 1> We have to pass json array to jsonObject, so we will use JsonArray method to achieve that
		// 2> But json array accepts the jsonstring, and will create a json array structure
		// 3> We will use Gson which will convert java object to  jsonstring , using toJson method
		// 4> the json string will be passed to the JSONArray to create an array of json string
		// 5> outside the loop we will pass it to the JSONObject, such that it merges with the "data"
		// 6> we will further convert the object to string in json format by toJsonString
		// 7> We will get one single json , our next goal is to format the json	
		// 8> Once we get the json , we will see escape chars got added to json 
		// 9> to remove escape chars Add apache common text jar - this as class called StringEscapeUtils and unescape Java method

		
		for(int i=0;i<a.size();i++) {
		
		ObjectMapper o = new ObjectMapper();
		o.writeValue(new File("customerInfo"+i+".json"), a.get(i));
		Gson g = new Gson();
		String jsonstring = g.toJson(a.get(i));
		js.add(jsonstring);
		
		
	}
		
		JSONObject jo = new JSONObject();
		jo.put("data", js);
		System.out.println(jo.toJSONString());
		String unescapeString = StringEscapeUtils.unescapeJava(jo.toJSONString());
		System.out.println(unescapeString);
		
		String string1 = unescapeString.replace("\"{", "{");
        String finalString = string1.replace("}\"", "}");
        System.out.println(finalString);
        
        try(FileWriter file = new FileWriter("/Users/nikhilkanojia/seleniumProject/UDEMY_SDET/singleJson.json")){
        file.write(finalString);
        }
        	
		
		
		
		
		
		
		
		
		
	}

}
