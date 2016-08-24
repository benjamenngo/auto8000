package actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;
public class RemoveCar extends ActionSupport {

private Car carBean;
	private int i = 1;
	public String execute() throws Exception{
		try{
			System.out.println(carBean);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","test_user","test_password");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * FROM cars");
			while(rs.next()){
				System.out.println(rs.getString(i));
				i++;
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return SUCCESS;
	}
	public Car getCarBean(){
		return carBean;
	}
	public void setCarBean(Car Car){
		carBean = Car;
	}



}
