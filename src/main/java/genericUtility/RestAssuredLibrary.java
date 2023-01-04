package genericUtility;

import io.restassured.response.Response;

public class RestAssuredLibrary {
	/**
	 * This method will return json data from correspondingresponse body
	 * @param response
	 * @param Path
	 * @return
	 */

	public String getJsonData(Response response, String Path)
	{
		String jsonData = response.jsonPath().get(Path);
		return jsonData;
	}
}
