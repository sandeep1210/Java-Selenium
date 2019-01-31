package com.selenium.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.util.SeleniumUtil;

public class AutomateGmailLogin {

	public static void main(String args[]) {
		gmailLogin();
		
	}
	
	public static void gmailLogin() {
		
	SeleniumUtil util = new SeleniumUtil();

	System.setProperty("webdriver.gecko.driver","C:\\Users\\sande\\Desktop\\Projects\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	String url = "https://accounts.google.com/signin";	
	driver.get(url);
	WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
	email_phone.sendKeys(util.getGmailUser());
	driver.findElement(By.id("identifierNext")).click();
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(password));
	password.sendKeys(util.getGmailPass());
	driver.findElement(By.id("passwordNext")).click();
	driver.close();
	}
}
