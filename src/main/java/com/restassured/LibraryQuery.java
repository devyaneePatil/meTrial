package com.restassured;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class LibraryQuery {
	public static void main(String[] args) {
		String qParam = "Kalam";
		given().queryParam("AuthorName", qParam)
		.contentType(ContentType.JSON)
		.when().get("http://216.10.245.166/Library/GetBook.php")
		.then().log().all();
	}
}
