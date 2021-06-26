package restapitesting;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream; 


public class User {
	
	String firstname;
	String lastname;
	int subjectid;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}

	public User(String firstname, String lastname, int i) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.subjectid = i;
	}



}
