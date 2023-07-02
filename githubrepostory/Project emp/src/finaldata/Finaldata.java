package finaldata;
import employeedetails.EmployeeDetails;

import maintence.Data;
public class Finaldata {
	public static void main(String args[])

	{

	EmployeeDetails bcobj = new EmployeeDetails();

	bcobj.setEmployeeId(100);
	bcobj.setFname("George");
	bcobj.setLname("Thomas");
	bcobj.setEmail("kalai123@gmill.com");
	bcobj.setPhoneNumber("1234567890");


	int ans = Data.enterdata(bcobj);

	System.out.println(ans);
	}
}
