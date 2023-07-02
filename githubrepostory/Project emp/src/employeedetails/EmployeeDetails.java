package employeedetails;

import java.sql.Connection;

public class EmployeeDetails {
	private int employeeId;
	  private String firstName;
	  private String lastName;
	  private String email;
	  private String phoneNumber;
	 
	  public int getEmployeeId() {
	return employeeId;
	}
	public void setEmployeeId(int employeeId) {
	this.employeeId= employeeId;
	}
	public String getFname() {
	return firstName;
	}
	public void setFname(String firstName) {
	this.firstName = firstName;
	}
	public String getLname() {
	return lastName;
	}
	public void setLname(String lastName) {
	this.lastName = lastName;

	}
	public String getEmail() {
	return email;
	}
	public void setEmail(String email) {
	this.email = email;

	}

	public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;

	}
	public String getPhoneNumber() {
	return phoneNumber;
	}
	public static Connection getDBConnection() {
	
		return null;
	}
	
}
