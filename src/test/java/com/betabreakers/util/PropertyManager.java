package com.betabreakers.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {

	public String homePageTitle = "";
	public String servicesPageTitle = "";
	public String whyTestPageTitle = "";
	public String theLabsPageTitle = "";
	public String companyPageTitle = "";
	public String contactPageTitle = "";
	public String blogPageTitle = "";

	public void generateProperty() {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("src/parameters.properties");
			prop.load(input);

			homePageTitle = prop.get("home_page_title").toString();



		} catch (IOException e) {
			e.printStackTrace();

		}
	}


}
