package actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class CarViewer extends ActionSupport{
	
	public String execute() throws Exception{
		/*---------------------Connecting to database--------------------------*/
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","test_user","********");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT COUNT(*)FROM cars");	
			
			while(rs.next()){             // if the ResultSet has an entry get the String of the entry
				//get string
			}
			
			con.close();
		}catch(Exception e){System.out.println(e);
		
		}
		
		return SUCCESS;
	}
}
