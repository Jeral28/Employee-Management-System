package maintence;
import java.sql.PreparedStatement;
import java.sql.Connection;
import employeedetails.EmployeeDetails;
public class Data {
	public static int enterdata(EmployeeDetails bcobj) {
		int i=0;
		try {
		PreparedStatement pst=EmployeeDetails.getDBConnection().prepareStatement("insert into employee values(?,?,?,?,?)");
		pst.setInt(1,bcobj.getEmployeeId());
		pst.setString(2, bcobj.getFname());
		pst.setString(3, bcobj.getLname());
		pst.setString(4, bcobj.getEmail());
		pst.setString(5, bcobj.getPhoneNumber());
		i=pst.executeUpdate();
		}
		catch(Exception e) {
		e.printStackTrace();
		System.out.println("Exception is Passing Data");
		}
		if(i==1) {
		return 1;
		}
		else return 0;
		}
}
