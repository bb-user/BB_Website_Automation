package com.betabreakers.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {

	public String contactFormNameField = "";
	public String contactNameValue = "";
	public String contactFormAddressField = "";
	public String contactAddressValue = "";
	public String contactFormPostCodeField = "";
	public String contactPostCodeValue = "";
	public String contactFormEmailField = "";
	public String contactEmailValue = "";


	public void generateProperty() {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("src/parameters.properties");
			prop.load(input);

			contactFormNameField = prop.get("name_field").toString();
			contactNameValue = prop.get("name_value").toString();

			contactFormAddressField = prop.getProperty("address_field").toString();
			contactAddressValue = prop.get("address_value").toString();

			contactFormPostCodeField = prop.get("postcode_field").toString();
			contactPostCodeValue = prop.get("postcode_value").toString();

			contactFormEmailField = prop.get("email_field").toString();
			contactEmailValue = prop.get("email_value").toString();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}


}
