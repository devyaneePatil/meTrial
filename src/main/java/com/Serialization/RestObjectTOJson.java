package com.Serialization;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class RestObjectTOJson {
	public static void main(String[] args) {
		Serial s = new Serial();
		s.setAuthor("Devyanee");
		s.setAisle("436823");
		s.setIsbn("CHILL");
		s.setName("Me Marathi");

		given().contentType(ContentType.JSON).log().all()
		.body(s).when()
				.post("http://216.10.245.166/Library/GetBook.php")
				.then().log().all();
	}
}
