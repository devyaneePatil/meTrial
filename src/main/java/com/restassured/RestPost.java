package com.restassured;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;

public class RestPost {
	public static void main(String[] args) {
		given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer 2dae294e29123c15223a8a4d78543f46b2fae9291391f53abfcfc20843e3f3d5")
				.body("{\r\n" + "    \"name\": \"Devyanee Nemade\",\r\n" + "    \"gender\": \"female\",\r\n"
						+ "    \"email\": \"dn47455867@xyz.com\",\r\n" + "    \"status\": \"active\"\r\n" + "}")
				.log().all().when().post("https://gorest.co.in/public/v1/users/").then().log().all();
	}
}
