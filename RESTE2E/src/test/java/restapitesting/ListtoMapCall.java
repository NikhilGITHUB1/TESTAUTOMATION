package restapitesting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListtoMapCall {

	public static void main(String[] args) {

		//ListToMap obj = new ListToMap();
		Map<String, Object> map = new HashMap<String,Object>();

		User user =new User("a","b",1);
		User user1 =new User("x","y",2);

		List<User> userslist=new ArrayList<User>();
		userslist.add(user);
		userslist.add(user1);


		ListToMap.listToHashmapJava7Below(userslist);

		//map.forEach((k,v) -> System.out.println("Key = "
		//          + k + ", Value = " + v)); 


	}

}
