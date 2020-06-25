package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class rep1 {
	@Autowired
	JdbcTemplate jdbt;
    

	public String adding(Model d) {
		
		
		
		String lastName=d.getLastName();
		String firstName=d.getFirstName();
		String middleName=d.getMiddleName();
		String gender=d.getGender();
		String phone=d.getPhone();
		String emailAddress=d.getEmailAddress();
		String matrialStatus=d.getMatrialStatus();
		String date=d.getDate();
		System.out.println(phone);
		System.out.println(lastName);
		String query = "INSERT INTO Registration VALUES(?,?,?,?,?,?,?,?)";
		int i= jdbt.update( query, lastName,firstName,middleName,gender,phone,emailAddress,matrialStatus,date);
		if(i>0) {
			return "insertted sucessfully";
			}
		return "not inserted";
		}
	
}
