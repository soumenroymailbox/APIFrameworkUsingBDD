package testLibrary;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;

@SuppressWarnings("unused")
public class TC01_Get_Request1 
{

	@Test
	public void getBooks()
	{
		given()
		.when()
			.get("https://demoqa.com/BookStore/v1/Books")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.header("content-type", "application/json; charset=utf-8")
			.assertThat().body(notNullValue());
	}
	
}
