package GETExamples;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetBookingIds_RestfulBooker {

	// Without static import and builder pattern
	@Test
	public void GetBookingIds_VerifyStatusCode() {
		/*
		 * RestAssured is a class which has a static overloaded method named get(). It
		 * returns a Response reference which contains all response details. Response is
		 * an interface. We are using overloaded version of get(String path) where path
		 * is URI.
		 */
		Response res = RestAssured.get("https://restful-booker.herokuapp.com/booking");
		

		// Let's print response body.
		String resString = res.asString();
		System.out.println("Respnse Details : " + resString);

		/*
		 * To perform validation on response like status code or value, we need to get
		 * ValidatableResponse type of response using then() method of Response
		 * interface. ValidatableResponse is also an interface.
		 */
		ValidatableResponse valRes = res.then();
		// It will check if status code is 200
		valRes.statusCode(200);
		// It will check if status line is as expected
		valRes.statusLine("HTTP/1.1 200 OK");
		
		

	}

}
