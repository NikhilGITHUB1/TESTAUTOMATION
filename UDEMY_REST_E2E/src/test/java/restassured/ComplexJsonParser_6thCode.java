package restassured;

import io.restassured.path.json.JsonPath;


//as a part of this section we used jsoneditoronline, 
//mocked the response, and pass the response in payload, calling the response in this class
//then using different methods to get the json values

public class ComplexJsonParser_6thCode {

	public static void main(String[] args) {

		JsonPath js  = new JsonPath(payload.coursePrice());

		//Print No of courses returned by API, since courses is an array, we are calling the size method
		int noOfCourses = js.getInt("courses.size()");
		System.out.println("noOfCourses are:" + noOfCourses);


		//Print Purchase Amount
		int purchaseamount = js.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseamount);


		//Print Title of the 1st course
		String title = js.get("courses[0].title");
		System.out.println(title);

		//print all the courses
		for(int i=0;i<noOfCourses;i++) {

			String coursetitle = js.get("courses["+i+"].title");
			System.out.println(coursetitle);
		}

		//print the number of copies for RPA title
		for(int i=0;i<noOfCourses;i++) {

			String coursetitle = js.get("courses["+i+"].title");
			if(coursetitle.equals("RPA")){
			System.out.println("copies for RPA");
            System.out.println(js.getString("courses["+i+"].copies"));
            break;
			}  

		}
		
		//Verify if Sum of all Course prices matches with Purchase Amount
		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseAmount);
		
		int sum = 0;
		
		for(int i=0;i<noOfCourses;i++) {
			
		sum+=js.getInt("courses["+i+"].price")*js.getInt("courses["+i+"].copies");
		

		}
		
		System.out.println(sum);

		
		if(sum==purchaseAmount) {
			System.out.println("sum matches with the purchase amount");
			
		}
		



	}

}
