package actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class CarViewer extends ActionSupport{
	
	private int count;
	private int i=0;
	public int getCount(){
		return count;
	}
	String genCarView="<td>Car"+i+"</td>";
	

	public String execute() throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","test_user","test_password");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT COUNT(*)FROM cars");	
			
			while(rs.next()){
				count=rs.getInt(1);
			}
			
			con.close();
		}catch(Exception e){System.out.println(e);
		
		}
		
		return SUCCESS;
	}
}
