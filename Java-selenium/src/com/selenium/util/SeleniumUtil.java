package com.selenium.util;

import java.util.Properties;

public class SeleniumUtil {

	private String gmailUser;
	private String gmailPass;

		
	public SeleniumUtil(){
		getProperties();
	}
	
	private void getProperties() {
	
			Properties properties = null;
	        properties = new Properties();
	        try {
	            properties.load(SeleniumUtil.class.getClassLoader()
	                    .getResourceAsStream("util.properties"));
	             } catch (Exception e) {
	            e.printStackTrace();
	        }
	       
		 this.gmailUser = properties.getProperty("GMAIL_USER");
		 this.gmailPass = properties.getProperty("GMAIL_PASSWORD");
	
	      
		}

	public String getGmailUser() {
		return gmailUser;
	}

	public void setGmailUser(String gmailUser) {
		this.gmailUser = gmailUser;
	}

	public String getGmailPass() {
		return gmailPass;
	}

	public void setGmailPass(String gmailPass) {
		this.gmailPass = gmailPass;
	}
}
