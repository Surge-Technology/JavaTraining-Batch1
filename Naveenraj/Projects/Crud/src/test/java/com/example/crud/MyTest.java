package com.example.crud;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import org.json.JSONArray;

public class MyTest {

	@SuppressWarnings("finally")
	public String myJSON() {
		String localJson = "";

		try {
			
			  String Selectednnidetails = "[{\"status\":\"IN EFFECT\",\"TCOMSALocation\":\"PYM\",\"TCOMSZLocation\":\"PYM\",\"circuitSpeed\":\"1.544 Mbps\",\"isCFARequired\":\"\",\"framing\":\"M13\",\"lineCode\":\"B3ZS\" , \"groomInformation\":[{\"tdmCkt\":\"NP0040010097\",\"groomToCkt\":\"NPA000231045\",\"groomToChannel\":\"4\"}],\"circuitID\":\"NP0040010097\",\"controlEnd\":\"N\",\"asrDesc\":\"No\",\"asr\":\"N\",\"cutPointSite\":\"PYM\",\"cityPairChange\":\"N\",\"groomToSite\":\"PYM\",\"bandwidth\":\"DS1\"}]";
			
			
			
			
			//selectednnidetails = "[{\"status\":\"IN EFFECT\",\"TCOMSALocation\":\"PYM\",\"TCOMSZLocation\":\"PYM\",\"circuitSpeed\":\"1.544 Mbps\",\"isCFARequired\":\"\",\"framing\":\"M13\",\"lineCode\":\"B3ZS\" , \"groomInformation\":[{\"tdmCkt\":\"NP0040010097\",\"groomToCkt\":\"NPA000231045\",\"groomToChannel\":\"4\"}],\"circuitID\":\"NP0040010097\",\"controlEnd\":\"N\",\"asrDesc\":\"No\",\"asr\":\"N\",\"cutPointSite\":\"PYM\",\"cityPairChange\":\"N\",\"groomToSite\":\"PYM\",\"bandwidth\":\"DS1\"}]";
			// selectednnidetails="[{\"customerName\":\"\",\"circuitID\":\"NP0CFKP40001\",\"ICSCCode\":\"GT\",\"status\":\"IN_SERVICE\",\"TCOMSZLocation\":\"99999999\",\"TCOMSALocation\":\"IRNGTX87\",\"circuitSpeed\":\"\",\"ECCKT\":\"12/HCGS/366553//GTEC\"}]";

			
			Collection inContactsList = null;
			String contactsArray = new JSONArray(inContactsList).toString();
			Collection selectednnidetails = null;
			org.json.JSONArray inputArray = new org.json.JSONArray(selectednnidetails);
			//org.json.JSONArray selectedRiderListArray = new org.json.JSONArray(selectedRiderList);

			String circuitInfo = "[";
			int noOfCircuits = inputArray.length();
			String groomSite = "";
			String cutPointSite = "";
			String controlEnd = "";
			String asrRequired = "";
			String tdmCircuits = "";

			int noOfTDMCircuitsCheck = 0;

			int noOfCircuitsCheck = inputArray.length() - 1;

			for (int i = 0; i < inputArray.length(); i++) {

				org.json.JSONObject inputObject = inputArray.getJSONObject(i);

				String bandwidth = "";
				String CircuitOptioningInfo = "";

				if (inputObject.has("bandwidth")) {
					bandwidth = (String) inputObject.get("bandwidth");
				}

				if (inputObject.has("groomInformation")) {

					org.json.JSONArray inputArray1 = (org.json.JSONArray) inputObject.get("groomInformation");
					
					noOfTDMCircuitsCheck = inputArray1.length() - 1;

					for (int j = 0; j < inputArray1.length(); j++) {

						org.json.JSONObject inputObject1 = inputArray1.getJSONObject(j);

						if (bandwidth == "DS1") {
							CircuitOptioningInfo = " \"framing\":  " + "\"" + inputObject.get("framing") + "\"" + ", " +

									"\"lineCode\":  " + "\"" + inputObject.get("lineCode") + "\"" + ", " + "";
						} else if (bandwidth == "DS0") {

							CircuitOptioningInfo = "\"primTrunkConditioning\":  " + "\""
									+ inputObject.get("primTrunkConditioning") + "\"" + ", " +

									"\"secTrunkConditioning\":  " + "\"" + inputObject.get("secTrunkConditioning")
									+ "\"" + ", " + "";

						}

						String selectedRiderListArray = null;
						tdmCircuits += "{\"tdmCircuitID\":  " + "\"" + inputObject1.get("tdmCkt") + "\"" + ", " +

								"\"speed\":  " + "\"" + inputObject.get("circuitSpeed") + "\"" + ", " +

								"\"childBandwidth\": " + "\"" + bandwidth + "\"" + ", " +

								CircuitOptioningInfo +

								"\"tcomsInterConnectChannel\":  " + "\"" + inputObject1.get("groomToChannel") + "\""
								+ ", " +

								"\"LDInterConnectSiteID\":  " + "\"" + inputObject1.get("groomToCkt") + "\","
								+ "\"riders\": " + selectedRiderListArray + "}";

						if (j != noOfTDMCircuitsCheck) {

							tdmCircuits += ",";

						}

					}

				}

				
				String inNfId = null;
				circuitInfo += "{\"customerName\": \"\"," +
				
						"\"sites\": {" + "\"aSideSiteId\": " + "\"" + inputObject.get("TCOMSALocation") + "\"" + ", " +

						"\"zSideSiteId\": " + "\"" + inputObject.get("TCOMSZLocation") + "\"," +

						"\"owner\": \"MECCA\"}" + ", " +

						"\"speedUnit\":  " + "\"" + bandwidth + "\"" + ", " +

						"\"cityPairChange\":  " + "\"" + inputObject.get("cityPairChange") + "\"" + ", " +

						"\"nfId\":  " + "\"" + inNfId + "\"" + ", " +

						"\"networkOption\": \"Option2\"," +

						"\"tdmCircuits\": [" + tdmCircuits + "]," +

						"\"circuitType\": \"AGO_GRM\"" +

						"}";
				
				

				if (i != noOfCircuitsCheck) {

					circuitInfo += ",";

				}

				groomSite = (String) inputObject.get("groomToSite");

				cutPointSite = (String) inputObject.get("cutPointSite");

				controlEnd = (String) inputObject.get("controlEnd");

				asrRequired = (String) inputObject.get("asr");

			}

			circuitInfo += "]";

			// logger.info("::::::Option Info loger333:::");

			DateFormat formatter, targetFormatter = null;

			formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			targetFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");

			Date convertedDate = null;

			String dueDateStr = "";

			String currentDtStr = targetFormatter.format(new Date());
			String orderRemarks = null;
			String orderVersion = null;
			String bgwOrderNo = null;
			String inCreatedBy = null;
			String inDueDate = null;
			localJson = "{" + "\"services\":" + circuitInfo + ", " + "\"orderRemarks\":" + "\"" + orderRemarks + "\""
					+ ", " + "\"revisionNumber\":" + "\"" + orderVersion + "\"" + ", " + "\"noOfCircuits\":" + "\""
					+ noOfCircuits + "\"" + ", " + "\"orderType\": \"AGO_GRM\"" + ", " + "\"groomSite\": \"" + groomSite
					+ "\"" + ", " + "\"customerSiteCode\": \"" + cutPointSite + "\"" + ", "
					+ "\"countryCode\": \"USA\"," +

					"\"countryOfSale\": \"USA\"," + "\"contacts\":" + contactsArray + ", " + "\"receivedDate\":" + "\""
					+ currentDtStr + "\"" + ", " + "\"orderNumber\":" + "\"" + bgwOrderNo + "\"" + ", "
					+ "\"controlEnd\":" + "\"" + controlEnd + "\"" + ", " + "\"asrRequired\":" + "\"" + asrRequired
					+ "\"" + ", " + "\"configuration\": {" + "\"name\": \"Groomer_ONE_WORLDID\"" + "," + "\"value\": "
					+ "\"" + inCreatedBy + "\"" +

					"}" + ", " +

					"\"dueDate\":" + "\"" + inDueDate + "\"" +

					"}";

			// localJson=contactsArray+circuitInfo;

			// logger.info("::::::Option Info loger444:::",localJson);

		} catch (Exception e)

		{
			// logger.info("::::::errorr in updateJSOn::",e);
			e.printStackTrace();

		}

		finally

		{
			// logger.info("::::::option Info updateJSOn::",localJson);
			return localJson;

		}
	}

}

