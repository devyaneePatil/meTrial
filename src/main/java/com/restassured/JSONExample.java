package com.restassured;

import java.io.FileNotFoundException;
import io.restassured.path.json.JsonPath;

public class JSONExample {
	public static void main(String[] args) throws FileNotFoundException {
		// FileInputStream fis = new
		// FileInputStream("C:/Users/aksha/OneDrive/Desktop/Devyanee/jsonviewer.txt");
		String fis = "{\"dashboard\":{\"purchaseAmount\":40000,\"website\":\"www.testingshastra.com\",\"studentId\":\"911\"},\"courses\":{\"webautomation\":[{\"title\":\"Selenium\",\"price\":4000},{\"title\":\"Cypress\",\"price\":6000},{\"title\":\"Protractor\",\"price\":7000}],\"api\":[{\"title\":\"Rest API\",\"price\":5000},{\"title\":\"Soap UI\",\"price\":6000}],\"MobileAutomation\":[{\"title\":\"C-Test\",\"price\":5000},{\"title\":\"Appium\",\"price\":6000}]}}";
		JsonPath js = new JsonPath(fis);
		String coursesNames[] = { "webautomation", "api", "MobileAutomation" };
		int sum = 0;
		for (int i = 0; i < js.getInt("courses.size()"); i++) {
			for (int j = 0; j < js.getInt("courses." + coursesNames[i] + ".size()"); j++) {
				sum = sum + js.getInt("courses." + coursesNames[i] + "[" + j + "].price");

			}
			System.out.println("Addition of courses price: " + sum);
			int gotsum = js.getInt("dashboard.purchaseAmount");
			if (sum == gotsum) {
				System.out.println("addition equals :True ");
			} else {
				System.out.println("Addition is not equal to actual purchase amount : " + "it is: " + gotsum);
			}
		}

	}
}