package application;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostReqEx{
	private final String USER_AGENT = "Mozilla/5.0";


	// HTTP POST request
	void sendPost(String stock,
	String make,
	String model,
	String trim,
	String odometer,
	String drivetrain,
	String bodyType,
	String fuelType,
	String engine,
	String transmission,
	String doors,
	String passenger,
	String exteriorColour,
	String interiorColour,
	String carproofClean,
	String noAccidents,
	String airConditioning,
	String cruiseControl,
	String tractionControl,
	String powerMirrors,
	String powerMoonRoof,
	String powerWindows,
	String powerLock,
	String powerSteering,
	String powerBreaks,
	String am,
	String fm,
	String cd,
	String mp3,
	String bluetooth,
	String usb,
	String leather,
	String cloth,
	String roofRack,
	String fogLights) throws Exception {
		
		String url = "http://localhost:8080/prac/Register";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//add request header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "carBean.stock="+stock+"&carBean.make="+make+"&carBean.model="+model+"&carBean.trim="+trim+"&carBean.odometer="+odometer+"&carBean.drivetrain="+drivetrain+"&carBean.bodyType="+bodyType+"&carBean.fuelType="+fuelType+"&carBean.engine="+engine+"&carBean.transmission="+transmission+"&carBean.doors="+doors+"&carBean.passenger="+passenger+"&carBean.exteriorColour="+exteriorColour+"&carBean.interiorColour="+interiorColour+"&carBean.carproofClean="+carproofClean+"&carBean.noAccidents="+noAccidents+"&carBean.airConditioning="+airConditioning+"&carBean.cruiseControl="+cruiseControl+"&carBean.tractionControl="+tractionControl+"&carBean.powerMirrors="+powerMirrors+"&carBean.powerMoonRoof="+powerMoonRoof+"&carBean.powerWindows="+powerWindows+"&carBean.powerLock="+powerLock+"&carBean.powerSteering="+powerSteering+"&carBean.powerBreaks="+powerBreaks+"&carBean.am="+am+"&carBean.fm="+fm+"&carBean.cd="+cd+"&carBean.mp3="+mp3+"&carBean.bluetooth="+bluetooth+"&carBean.usb="+usb+"&carBean.leather="+leather+"&carBean.cloth="+cloth+"&carBean.roofRack="+roofRack+"&carBean.fogLights="+fogLights+"";

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();


		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());

	}
}
