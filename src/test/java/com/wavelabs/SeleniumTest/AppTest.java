package com.wavelabs.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
	
	public WebDriver driver;

	@BeforeTest
	public void beforeTest(){
		driver = new FirefoxDriver();
	}
	
	@Test(description = "facebook open page")
	public void url() {
		
		driver.get("https://facebook.com");

	}

	@Test(description = "login page", dependsOnMethods = "url")
	public void login() {

		driver.findElement(By.id("username")).sendKeys("**********");
		driver.findElement(By.id("password")).sendKeys("********");
	}
}
