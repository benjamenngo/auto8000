package actions;

public class Car {
	/* -------------------declaring variables---------------------------------------*/
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
	private String	carproofClean;
	private String noAccidents;
	private String airConditioning;
	private String cruiseControl;
	private String tractionControl;
	private String powerMirrors;
	private String powerMoonRoof;
	private String powerWindows;
	private String powerLock;
	private String powerSteering;
	private String powerBreaks;
	private String am;
	private String fm;
	private String cd;
	private String mp3;
	private String bluetooth;
	private String usb;
	private String leather;
	private String cloth;
	private String roofRack;
	private String fogLights;
	/*------------------------------------Getters and Setters--------------------------------*/
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTrim() {
		return trim;
	}
	public void setTrim(String trim) {
		this.trim = trim;
	}
	public String getOdometer() {
		return odometer;
	}
	public void setOdometer(String odometer) {
		this.odometer = odometer;
	}
	public String getDrivetrain() {
		return drivetrain;
	}
	public void setDrivetrain(String drivetrain) {
		this.drivetrain = drivetrain;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getPassenger() {
		return passenger;
	}
	public void setPassenger(String passenger) {
		this.passenger = passenger;
	}
	public String getExteriorColour() {
		return exteriorColour;
	}
	public void setExteriorColour(String exteriorColour) {
		this.exteriorColour = exteriorColour;
	}
	public String getInteriorColour() {
		return interiorColour;
	}
	public void setInteriorColour(String interiorColour) {
		this.interiorColour = interiorColour;
	}
	public String isCarproofClean() {
		return carproofClean;
	}
	public void setCarproofClean(String carproofClean) {
		this.carproofClean = carproofClean;
	}
	public String isNoAccidents() {
		return noAccidents;
	}
	public void setNoAccidents(String noAccidents) {
		this.noAccidents = noAccidents;
	}
	public String isAirConditioning() {
		return airConditioning;
	}
	public void setAirConditioning(String airConditioning) {
		this.airConditioning = airConditioning;
	}
	public String isCruiseControl() {
		return cruiseControl;
	}
	public void setCruiseControl(String cruiseControl) {
		this.cruiseControl = cruiseControl;
	}
	public String isTractionControl() {
		return tractionControl;
	}
	public void setTractionControl(String tractionControl) {
		this.tractionControl = tractionControl;
	}
	public String isPowerMirrors() {
		return powerMirrors;
	}
	public void setPowerMirrors(String powerMirrors) {
		this.powerMirrors = powerMirrors;
	}
	public String isPowerMoonRoof() {
		return powerMoonRoof;
	}
	public void setPowerMoonRoof(String powerMoonRoof) {
		this.powerMoonRoof = powerMoonRoof;
	}
	public String isPowerWindows() {
		return powerWindows;
	}
	public void setPowerWindows(String powerWindows) {
		this.powerWindows = powerWindows;
	}
	public String isPowerLock() {
		return powerLock;
	}
	public void setPowerLock(String powerLock) {
		this.powerLock = powerLock;
	}
	public String isPowerSteering() {
		return powerSteering;
	}
	public void setPowerSteering(String powerSteering) {
		this.powerSteering = powerSteering;
	}
	public String isPowerBreaks() {
		return powerBreaks;
	}
	public void setPowerBreaks(String powerBreaks) {
		this.powerBreaks = powerBreaks;
	}
	public String isAm() {
		return am;
	}
	public void setAm(String am) {
		this.am = am;
	}
	public String isFm() {
		return fm;
	}
	public void setFm(String fm) {
		this.fm = fm;
	}
	public String isCd() {
		return cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
	public String isMp3() {
		return mp3;
	}
	public void setMp3(String mp3) {
		this.mp3 = mp3;
	}
	public String isBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}
	public String isUsb() {
		return usb;
	}
	public void setUsb(String usb) {
		this.usb = usb;
	}
	public String isLeather() {
		return leather;
	}
	public void setLeather(String leather) {
		this.leather = leather;
	}
	public String isCloth() {
		return cloth;
	}
	public void setCloth(String cloth) {
		this.cloth = cloth;
	}
	public String isRoofRack() {
		return roofRack;
	}
	public void setRoofRack(String roofRack) {
		this.roofRack = roofRack;
	}
	public String isFogLights() {
		return fogLights;
	}
	public void setFogLights(String fogLights) {
		this.fogLights = fogLights;
	}
	
	/*--------------------------------toString Method---------------------------------------------*/
	@Override
	public String toString() {
		return "Stock: " + getStock() + "Make: " + getMake() + "Model: " + getModel()
				+ "Trim: " + getTrim() + "Odometer=" + getOdometer() + "Drivetrain: "
				+ getDrivetrain() + "BodyType: " + getBodyType() + ", fuelType="
				+ getFuelType() + ", engine=" + getEngine() + ", transmission="
				+ getTransmission() + ", doors=" + getDoors() + ", passenger="
				+ getPassenger() + ", exteriorColour=" + getExteriorColour()
				+ ", interiorColour=" + getInteriorColour() + ", carproofClean="
				+ isCarproofClean() + ", noAccidents=" + isNoAccidents()
				+ ", airConditioning=" + isAirConditioning() + ", cruiseControl="
				+ isCruiseControl() + ", tractionControl=" + isTractionControl()
				+ ", powerMirrors=" + isPowerMirrors() + ", powerMoonRoof="
				+ isPowerMoonRoof() + ", powerWindows=" + isPowerWindows()
				+ ", powerLock=" + isPowerLock() + ", powerSteering="
				+ isPowerSteering() + ", powerBreaks=" + isPowerBreaks() + ", am=" + isAm()
				+ ", fm=" + isFm() + ", cd=" + isCd() + ", mp3=" + isMp3() + ", bluetooth="
				+ isBluetooth() + ", usb=" + isUsb() + ", leather=" + isLeather()
				+ ", cloth=" + isCloth() + ", roofRack=" + isRoofRack()
				+ ", fogLights=" + isFogLights();
	}
	
	
	



}
