package Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BearerToken {

	@Test
	 public void token()
	 {
		given()
		  .auth().oauth2("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")
		.when()
		  .get("https://api.github.com/users/Rajputjayant/repos")
		.then()
		   .log().body();
	 }
}
