package DifferentWaysOfPassingPayloadToRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PassJSONPayloadAsString {

	

		@Test
		public void passPayloadJosnAsString() {
		// There is no need to add escape character manually. Just paste string within double 
		// quotes. It will automatically add escape sequence as required. 
		String jsonString = "{\"username\" : \"admin\",\"password\" : \"password123\"}";
		
		
		//GIVEN
		RestAssured
		.given()
			.baseUri("https://restful-booker.herokuapp.com/auth")
			.contentType(ContentType.JSON)
			.body(jsonString)
		// WHEN
		.when()
			.post()
		// THEN
		.then()
			.assertThat()
			.statusCode(200);
		}
		
		@Test
		public void passPayloadJosnAsStringt() throws ParseException {
		// There is no need to add escape character manually. Just paste string within double 
		// quotes. It will automatically add escape sequence as required. 
		String jsonString = "{\"username\" : \"admin\",\"password\" : \"password123\"}";
		
		
		JSONParser parser = new JSONParser();
		JSONObject payLoadAsJsonObject = (JSONObject)parser.parse(jsonString);
		
		
		
		
		
		System.out.println(s);
		
		//GIVEN
		RestAssured
		.given()
			.baseUri("https://restful-booker.herokuapp.com/auth")
			.contentType(ContentType.JSON)
			.body
		// WHEN
		.when()
			.post()
		// THEN
		.then()
			.assertThat()
			.statusCode(200);
		}
	
}
