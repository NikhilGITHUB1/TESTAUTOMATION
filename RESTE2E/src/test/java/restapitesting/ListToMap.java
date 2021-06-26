package restapitesting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {


	public static void listToHashmapJava7Below(List<User> students)
	{
		Map<String, Object> studentsMap=null; 
				
		for(User student : students)
		{
			
			studentsMap = new HashMap<String, Object>();
			
			studentsMap.put("firstName", student.getFirstname());
			studentsMap.put("lastName", student.getLastname());
			studentsMap.put("subjectId", student.getSubjectid());
			
			System.out.println(studentsMap);
			
		}
		
		
		
	}


}


