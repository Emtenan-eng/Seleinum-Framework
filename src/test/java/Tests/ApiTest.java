package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ApiTest extends TestBases{
	
	@Test
	public void ReturnApi() throws UnirestException {
		driver.navigate().to("https://alexwohlbruck.github.io/cat-facts/");
		JsonNode JsonResponse = 
				Unirest.get("https://cat-fact.herokuapp.com/facts").asJson().getBody();
		Assert.assertNotNull(JsonResponse);

	}
}
