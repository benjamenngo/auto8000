package actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {
	private Car carBean;
	
	public String execute() throws Exception{
		try{
			System.out.println(carBean);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","test_user","test_password");
			Statement stmt=con.createStatement();
			int rs=stmt.executeUpdate("INSERT INTO cars(Stock,Make,Model,Trim,Odometer,Drivetrain,BodyType,FuelType,Engine,Transmission,Doors,Passengers,ExteriorColour,InteriorColour,CarProof,NoAccidents,AirConditioning,CruiseControl,TractionControl,PowerMirrors,PowerMoonRoof,PowerWindows,PowerLock,PowerSteering,PowerBreaks,AM,FM,CD,MP3,Bluetooth,USB,Leather,Cloth,RoofRack,FogLights)VALUES('"+carBean.getStock()+"','"+carBean.getMake()+"','"+carBean.getModel()+"','"+carBean.getTrim()+"','"+carBean.getOdometer()+"','"+carBean.getDrivetrain()+"','"+carBean.getBodyType()+"','"+carBean.getFuelType()+"','"+carBean.getEngine()+"','"+carBean.getTransmission()+"','"+carBean.getDoors()+"','"+carBean.getPassenger()+"','"+carBean.getExteriorColour()+"','"+carBean.getInteriorColour()+"','"+carBean.isCarproofClean()+"','"+carBean.isNoAccidents()+"','"+carBean.isAirConditioning()+"','"+carBean.isCruiseControl()+"','"+carBean.isTractionControl()+"','"+carBean.isPowerMirrors()+"','"+carBean.isPowerMoonRoof()+"','"+carBean.isPowerWindows()+"','"+carBean.isPowerLock()+"','"+carBean.isPowerSteering()+"','"+carBean.isPowerBreaks()+"','"+carBean.isAm()+"','"+carBean.isFm()+"','"+carBean.isCd()+"','"+carBean.isMp3()+"','"+carBean.isBluetooth()+"','"+carBean.isUsb()+"','"+carBean.isLeather()+"','"+carBean.isCloth()+"','"+carBean.isRoofRack()+"','"+carBean.isFogLights()+"')");
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
