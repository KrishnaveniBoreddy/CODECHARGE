package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.log.Logger;

public class Codechargelogin {
	WebDriver driver;
	//locators

	@FindBy(name="login")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="DoLogin")
	WebElement loginbutton;
	//constructor
	public Codechargelogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void username(String uname) {
		username.sendKeys(uname);
	}
	//enter password
	public void password(String upass) {
		password.sendKeys(upass);
	}
	//click on login button
	public void click_loginbutton() {
		loginbutton.click();
	}
}
