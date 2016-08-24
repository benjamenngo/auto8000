package application;
import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
public class Controller {
	@FXML TextField getStock, getMake, getModel, getTrim, getOdometer, getDriveTrain, getBodyType, getFuelType, getEngine, getTransmission, getDoors, getPassengers, getExtColour, getIntColour,CarInfo;
	private String stock;
	private String make;
	private String model;
	private String trim;
	private String odometer;
	private String drivetrain;
	private String bodyType;
	private String fuelType;
	private String engine;
	private String transmission;
	private String doors;
	private String passenger;
	private String exteriorColour;
	private String interiorColour;
	private String carproofClean="false";
	private String noAccidents="false";
	private String airConditioning="false";
	private String cruiseControl="false";
	private String tractionControl="false";
	private String powerMirrors="false";
	private String powerMoonRoof="false";
	private String powerWindows="false";
	private String powerLock="false";
	private String powerSteering="false";
	private String powerBreaks="false";
	private String am="false";
	private String fm="false";
	private String cd="false";
	private String mp3="false";
	private String bluetooth="false";
	private String usb="false";
	private String leather="false";
	private String cloth="false";
	private String roofRack="false";
	private String fogLights="false";
	
	protected String getValue(String value){
		if(value!=null)
		return value;
		else
		return "empty";
	}
	
	
	    @FXML protected void handleAddCars(ActionEvent event) throws IOException {
	    /*--------------When Add Cars button is clicked loads a new stage with AddCars.fxml file-------------*/   
	    	System.out.println("addcars");
	        try{
	        	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/AddCars.fxml"));
	        	Parent root1 = (Parent) fxmlLoader.load();
	        	Stage stage = new Stage();
	        	stage.setScene(new Scene(root1, 1280, 720));
	        	stage.show();
	        	
	        }catch(Exception e){
	        	e.printStackTrace();
	        }
	    }
	    @FXML protected void handleDeleteCars(ActionEvent event) {
	        System.out.println("deleteCars");
	        
	    }
	    @FXML protected void handleViewCarInventory(ActionEvent event) {
	    	System.out.println("View Car Inventory");
		        try{
		        	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/ViewCars.fxml"));
		        	Parent root2 = (Parent) fxmlLoader.load();
		        	Stage stage = new Stage();
		        	stage.setScene(new Scene(root2, 1280, 720));
		        	stage.show();
		        	
		        	
		        }catch(Exception e){
		        	e.printStackTrace();
		        }
	    }
	    
	    @FXML protected void handleAddImages(ActionEvent event) {
	    	System.out.println("Add Images");
	    }
	    @FXML protected void handleDeleteImages(ActionEvent event) {
	    	System.out.println("Delete Image");
	    }
	    @FXML protected void handleViewImages(ActionEvent event) {
	    	System.out.println("View Images");
	    }
	    
/*-----------------------------------------Add Cars Controller-----------------------------------------------*/
	   
	    /*--------------------Handle checkbox form values------------------*/
	    @FXML protected void handleCarProof(ActionEvent event) {
	    	System.out.println(event);
	    	carproofClean = "true";
	    	System.out.println(carproofClean);
	    	
	    }
	    @FXML protected void handleAccidentFree(ActionEvent event) {
	    	System.out.println("View handleAccidentFree");
	    	noAccidents = "true";
	    	System.out.println(noAccidents);
	    }
	    @FXML protected void handleAirConditioning(ActionEvent event) {
	    	System.out.println("View handleAirConditioning");
	    	airConditioning = "true";
	    	
	    	
	    }
	    @FXML protected void handleCruiseControl(ActionEvent event) {
	    	System.out.println("View handleCruiseControl");
	    	cruiseControl = "true";
	    
	    }
	    @FXML protected void handleTractionControl(ActionEvent event) {
	    	System.out.println("View handleTractionControl");
	    	tractionControl = "true";
	    }
	    @FXML protected void handlePowerMirrors(ActionEvent event) {
	    	System.out.println("View handlePowerMirrors");
	    	powerMirrors = "true";
	    }
	    @FXML protected void handlePowerMoonRoof(ActionEvent event) {
	    	System.out.println("View handlePowerMoonRoof");
	    	powerMoonRoof = "true";
	    }
	    @FXML protected void handlePowerWindows(ActionEvent event) {
	    	System.out.println("View handlePowerWindows");
	    	powerWindows = "true";
	    }
	    @FXML protected void handlePowerLocks(ActionEvent event) {
	    	System.out.println("View handlePowerLocks");
	    	powerLock = "true";
	    	
	    }
	    @FXML protected void handlePowerSteering(ActionEvent event) {
	    	System.out.println("View handlePowerSteering");
	    	powerSteering = "true";
	    }
	    @FXML protected void handlePowerBreaks(ActionEvent event) {
	    	System.out.println("View handlePowerBreaks");
	    	powerBreaks = "true";
	    }
	    @FXML protected void handleAm(ActionEvent event) {
	    	System.out.println("View handleAm");
	    	am = "true";
	    }
	    @FXML protected void handleFm(ActionEvent event) {
	    	System.out.println("View handleFm");
	    	fm = "true";
	    }
	    @FXML protected void handleCd(ActionEvent event) {
	    	System.out.println("View handleCd");
	    	cd = "true";
	    }
	    @FXML protected void handleMp3(ActionEvent event) {
	    	System.out.println("View handleMp3");
	    	mp3 = "true";
	    }
	    @FXML protected void handleBluetooth(ActionEvent event) {
	    	System.out.println("View handleBluetooth");
	    	bluetooth = "true";
	    }
	    @FXML protected void handleUsb(ActionEvent event) {
	    	System.out.println("View handleUsb");
	    	usb = "true";
	    }
	    @FXML protected void handleLeather(ActionEvent event) {
	    	System.out.println("View handleLeather");
	    }
	    @FXML protected void handleCloth(ActionEvent event) {
	    	System.out.println("View handleCloth");
	    	leather = "true";
	    }
	    @FXML protected void handleRoofRack(ActionEvent event) {
	    	System.out.println("View handleRoofRack");
	    	cloth = "true";
	    }
	    @FXML protected void handleFogLights(ActionEvent event) {
	    	System.out.println("View handleFogLights");
	    	roofRack = "true";
	    }
	    @FXML protected void handleInfoSubmit(ActionEvent event) throws Exception{
	    	System.out.println("info submitted");
	    	stock = getValue(getStock.getText());
	    	make = getValue(getMake.getText());
	    	model = getValue(getModel.getText());
	    	trim = getValue(getTrim.getText());
	    	odometer = getValue(getOdometer.getText());
	    	drivetrain = getValue(getDriveTrain.getText());
	    	bodyType = getValue(getBodyType.getText());
	    	fuelType = getValue(getFuelType.getText());
	    	engine = getValue(getEngine.getText());
	    	transmission = getValue(getTransmission.getText());
	    	doors = getValue(getDoors.getText());
	    	passenger = getValue(getPassengers.getText());
	    	exteriorColour = getValue(getExtColour.getText());
	    	interiorColour = getValue(getIntColour.getText());
	    	
	    	PostReqEx http = new PostReqEx();
	    	http.sendPost(stock,make,model,trim,odometer,drivetrain,bodyType,fuelType,engine,transmission,doors,passenger,exteriorColour,interiorColour,carproofClean,noAccidents,airConditioning,cruiseControl,tractionControl,powerMirrors,powerMoonRoof,powerWindows,powerLock,powerSteering,powerBreaks,am,fm,cd,mp3,bluetooth,usb,leather,cloth,roofRack,fogLights);
	    }
	   
	   
	    

	
}
