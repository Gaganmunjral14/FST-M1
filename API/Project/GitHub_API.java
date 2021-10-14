package activities;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import org.testng.annotations.BeforeClass;

import org.testng.Assert;
import org.testng.Reporter;

public class GitHub_API {
	RequestSpecification requestSpec;

	ResponseSpecification responseSpec;

	int id;

	@BeforeClass
	public void gitHubSetUp() {

		requestSpec = new RequestSpecBuilder()
				.setContentType(ContentType.JSON)
				.addHeader("Authorization", "token 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")
				.setBaseUri("https://api.github.com")
				.build();

		responseSpec = new ResponseSpecBuilder()
				.expectContentType("application/json")
				.build();


	}
	@Test(priority=2)
	public void POSTRequest() {

		String request_body = "{\"title\": \"TestAPIKey\",\n"
				+ "    \"key\": \"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDb4o5rg5Yv6b+aIWjxlcAiIYhN9VmQb7AW/SnfVYniU0iNJQtuWIJwmIDsCcGYQx0XkOmrnkcwfclJXG8uExIrs96/zrXGR1/7JPF9kpKyS4FFmk5pZhtQY/6KM2e2DLuvef6ios570s0pHAhK3Ok94vOR3t74rlkAJiW7Rb5d76/4zJsrun3E6bSmdFKfTStJTGWZ6nUXIYLOYy3DtrJr6fMnKe4T7erPPOeryB8DKjU5uq2+Au3l30HYdvsAs0Ldjq0ruhLL0fkI5GsTaiATJxLAtks3NdSvlyZNjG+t2Q/JgQCwub/RxQ4XMm4zVOG8LEbhdvSm2rNPt5hcNsgxkJgJ+zyqq+7afZ3jKHzuUhZaoYs2w1e4Jl4rb0F2VchtQ/cCya2AN/jVU2FasLhagp4icAsoH6evMT6QInLv+L11K+NuIHFNTVGSIkLPQ7jCACX+4xlwHcBQlZhup3ftWhFVDr2ZVxs9LkiOok+n/RXqS14kxTNFrpwZHlzhhFM=\"}";

		Response response = given().spec(requestSpec)
				.body(request_body)
				.when().post("/user/keys");
		response.then().spec(responseSpec);

		// Print response
		String resp_body = response.getBody().asPrettyString();
		System.out.println(resp_body);
		id = response.then().extract().path("id");
		System.out.print("ID:" +id);

		// Assertion
		Assert.assertEquals(response.getStatusCode(),201);


	}
	@Test(priority=1)
	public void GETRequest() {
		Response response = given().spec(requestSpec)
				.get("/user/keys");

		//print
		System.out.println(response.getBody().asPrettyString());
		//report
		Reporter.log(response.getBody().asPrettyString());
		//Assertion
		Assert.assertEquals(response.getStatusCode(),200);

	}

	@Test(priority=3)

	public void DELETERequest() {
		Response response = given().spec(requestSpec).pathParam("keyId",id).delete("/user/keys/{keyId}");
		//Report
		Reporter.log(response.getBody().asPrettyString());
		//Assert
		Assert.assertEquals(response.getStatusCode(),204);
	}


}
