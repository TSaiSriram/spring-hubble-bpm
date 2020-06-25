package com.example.demo;

public class Model {
String lastName;
String firstName;
String middleName;
String gender;
String phone;
String emailAddress;
String matrialStatus;
String date;
public Model(String lastName, String firstName, String middleName, String gender, String phone, String emailAddress,
		String matrialStatus, String date) {
	super();
	System.out.println(lastName);
	this.lastName = lastName;
	this.firstName = firstName;
	this.middleName = middleName;
	this.gender = gender;
	this.phone = phone;
	this.emailAddress = emailAddress;
	this.matrialStatus = matrialStatus;
	this.date = date;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public String getMatrialStatus() {
	return matrialStatus;
}
public void setMatrialStatus(String matrialStatus) {
	this.matrialStatus = matrialStatus;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}

}
