package Authentication;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class TimeValidation {

	@Test
	 public void time()
	 {
		when()
		    .get("http://localhost:8084/projects")
		.then()
		    .assertThat().time(Matchers.lessThan(2000l), TimeUnit.MILLISECONDS);
		 //  .log().all();
		
	 }
}
