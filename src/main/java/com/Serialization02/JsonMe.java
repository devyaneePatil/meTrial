package com.Serialization02;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import io.restassured.http.ContentType;

public class JsonMe {
	public static <mobileAutomation, Api, WebAutomation> void main(String[] args) {
		Dashboard d = new Dashboard();
		Courses<mobileAutomation, Api, WebAutomation> c = new Courses<mobileAutomation, Api, WebAutomation>();
		d.setPurchaseAmount(40000);
		d.setStudentId("911");
		d.setWebsite("www.testingshastra.com");
		c.setDashboard(d);
		CoursesWeb cw1 = new CoursesWeb();
		cw1.setPrice(4000);
		cw1.setTitle("Selenium");
		CoursesWeb cw2 = new CoursesWeb();
		cw2.setPrice(6000);
		cw2.setTitle("Cypress");
		CoursesWeb cw3 = new CoursesWeb();
		cw3.setPrice(7000);
		cw3.setTitle("Protractor");
		ArrayList<CoursesWeb> al1 = new ArrayList<CoursesWeb>();
		al1.add(cw1);
		al1.add(cw2);
		al1.add(cw3);
		c.setWebautomation(al1);

		CoursesWeb ca1 = new CoursesWeb();
		ca1.setPrice(5000);
		ca1.setTitle("Rest API");
		CoursesWeb ca2 = new CoursesWeb();
		ca2.setPrice(6000);
		ca2.setTitle("Soap UI");
		ArrayList<CoursesWeb> al2 = new ArrayList<CoursesWeb>();
		al2.add(ca1);
		al2.add(ca2);
		c.setApi(al2);

		CoursesWeb cm1 = new CoursesWeb();
		cm1.setPrice(5000);
		cm1.setTitle("C-Test");
		CoursesWeb cm2 = new CoursesWeb();
		cm2.setPrice(6000);
		cm2.setTitle("Appium");
		ArrayList<CoursesWeb> al3 = new ArrayList<CoursesWeb>();

		c.setMobileAutomation(al3);
		al3.add(cm1);
		al3.add(cm2);
		given().contentType(ContentType.JSON).log().all().body(c).when()
				.put("http://216.10.245.166/Library/GetBook.php").then().log().all();
	}
}
//Class Courses{
//Private list<WebAutomation> webautomation;
//Private list<Api> api;
//}
// 
//Class Courses{
//Private list<CourseDetails> webautomation;
//Private list<CourseDetails> api;
////setters and getters
//}
//Class CourseDetails{
//Private String courseName;
//Private String fee;
////getters and setter