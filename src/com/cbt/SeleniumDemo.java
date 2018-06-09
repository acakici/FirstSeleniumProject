package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Cakici/Documents/selenium dependencies/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://cybertekschool.com/");
		
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Cakici/Documents/selenium dependencies/drivers/geckodriver.exe");
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://cybertekschool.com/");
		
		System.setProperty("webdriver.ie.driver",
				"C:/Users/Cakici/Documents/selenium dependencies/drivers/IEDriverServer.exe");
		
		WebDriver driver3 = new InternetExplorerDriver();
		driver3.get("https://cybertekschool.com/");
		
	}
	
	

}
