package mercuryWelcomegetPage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.gurock.testrail.APIException;

import com.gurock.testrail.APIClient;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class manageTestRail {

	public static String TEST_RUN_ID ;
	public static String TESTRAIL_USERNAME = "bijenderprasad@qainfotech.com";
	public static String TESTRAIL_PASSWORD = ("Password1!");
	public static String RAILS_ENGINE_URL = "https://mnv.testrail.com";
	public static final int TEST_CASE_PASSED_STATUS = 1;
	public static final int TEST_CASE_FAILED_STATUS = 5;
	static ArrayList<String> runids = new ArrayList<String>();

	public static void addResultForTestCase(int status, String error, String className, String MethodName)
			throws IOException, APIException, ParseException {
		JSONArray jarray = fetchData(className, MethodName);
		fillTestID(jarray);

		String testRunId = TEST_RUN_ID;
		APIClient client = new APIClient(RAILS_ENGINE_URL);
		client.setUser(TESTRAIL_USERNAME);
		client.setPassword(TESTRAIL_PASSWORD);
		Map data = new HashMap();

		data.put("suite_id", 1933);
		data.put("name", "This is a new test run");
		data.put("include_all", true);
		data.put("status_id", 1);
		data.put("comment", "Test Executed - Status updated automatically from Selenium test automation.");
		for (int i = 0; i < runids.size(); i++) {
			client.sendPost("add_result_for_case/" + testRunId + "/" + runids.get(i) + "", data);
		}
		// client.sendPost("add_run/30",data );
		// client.sendPost("delete_run/18867", data);
	}

	public static JSONArray fetchData(String className, String MethodName) throws IOException, ParseException {

		File f = new File("C:\\Users\\bijenderprasad\\Desktop\\Herbert\\herbertjava\\MyFrameworkNew\\TestData\\jsondata.txt");
		FileReader fr = new FileReader(f);
		BufferedReader in = new BufferedReader(fr);
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
			}
		in.close();

		JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) parser.parse(response.toString());
		JSONObject jsonObject1 = (JSONObject) parser.parse(jsonObject.get(className).toString());
		JSONArray jarr = (JSONArray) (jsonObject1.get(MethodName));
		return jarr;
						}

	public static void fillTestID(JSONArray jar) {
		for (Object y : jar) {
			runids.add((String) y);
		}
	}

	public static void cretaeTestRunFromTestSuite(String projectID, String suiteID) throws MalformedURLException, IOException, APIException {
		APIClient client = new APIClient(RAILS_ENGINE_URL);
		client.setUser(TESTRAIL_USERNAME);
		client.setPassword(TESTRAIL_PASSWORD);
		Map data = new HashMap();
		data.put("suite_id", suiteID);
		data.put("name", "This is a new test run");
		String uri = "add_run/" + projectID;
		Object obj = client.sendPost(uri, data);
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) (obj);
		TEST_RUN_ID= jsonObject.get("id").toString();

	}

}
