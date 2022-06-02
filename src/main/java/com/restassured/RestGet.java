package com.restassured;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;

public class RestGet {
	public static void main(String[] args) {
		given().log().all()
		.when().get("https://gorest.co.in/public/v2/users/2698").then()
		.assertThat()
		.statusCode(200)
		.body("id", Matchers.equalTo(2698))
		.body("email",Matchers.equalTo("gill_vasundhara@kirlin-fadel.com"))
		.body("status",Matchers.comparesEqualTo("active"))
				.log().all();

	}
}
