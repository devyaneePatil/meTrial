package com.restassured;

import io.restassured.path.json.JsonPath;

public class CoursesExample {
	public static void main(String[] args) {
		String json = "{\"dashboard\":"
				+ "{\"purchaseAmount\":40000,\"website\":\"www.testingshastra.com\",\"studentId\":\"911\"},\"courses\":{\"webautomation\":[{\"title\":\"Selenium\",\"price\":4000},{\"title\":\"Cypress\",\"price\":6000},{\"title\":\"Protractor\",\"price\":7000}],\"api\":[{\"title\":\"Rest API\",\"price\":5000},{\"title\":\"Soap UI\",\"price\":6000}],\"MobileAutomation\":[{\"title\":\"C-Test\",\"price\":5000},{\"title\":\"Appium\",\"price\":6000}]}}";
		JsonPath js = new JsonPath(json);
		int sizewebautomation = js.getInt("courses.webautomation.size()");
		int sizeapi = js.getInt("courses.api.size()");
		int sizemobileautomation = js.getInt("courses.MobileAutomation.size()");
		System.out.println("Size of Webautomation: " + sizewebautomation);
		System.out.println("Size of api : " + sizeapi);
		System.out.println("Size of MobileAutomation : " + sizemobileautomation);

		for (int i = 0; i < sizewebautomation; i++) {
			int first = js.getInt("courses.webautomation[" + i + "].price");
			// System.out.println(js.getInt("courses.webautomation[" + i + "].price"));
			System.out.println(first);
		}
		for (int j = 0; j < sizeapi; j++) {
			int second = js.getInt("courses.api[" + j + "].price");
			System.out.println(second);
		}
		for (int k = 0; k < sizemobileautomation; k++) {
			int third = js.getInt("courses.MobileAutomation[" + k + "].price");
			System.out.println(third);
		}

	}

}
//compaire with dashboard.purchaseamount