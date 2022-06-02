package com.Serialization02;

import java.util.ArrayList;
import java.util.List;

public class Courses<MobileAutomation, Api, WebAutomation> {
	private Dashboard dashboard;
	private List<WebAutomation> webautomation;
	private List<Api> api;
	private List<MobileAutomation> MobileAutomation;

	public Dashboard getDashboard() {
		return dashboard;
	}

	public void setDashboard(Dashboard dashboard) {
		this.dashboard = dashboard;
	}

	public List<WebAutomation> getWebautomation() {
		return webautomation;
	}

	public void setWebautomation(ArrayList<CoursesWeb> al1) {
		this.webautomation = (List<WebAutomation>) al1;
	}

	public List<Api> getApi() {
		return api;
	}

	public void setApi(ArrayList<CoursesWeb> al2) {
		this.api = (List<Api>) al2;
	}

	public List<MobileAutomation> getMobileAutomation() {
		return MobileAutomation;
	}

	public void setMobileAutomation(ArrayList<CoursesWeb> al3) {
		MobileAutomation = (List<MobileAutomation>) al3;
	}

}
