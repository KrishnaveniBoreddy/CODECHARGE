package com.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.Codechargelogin;
import com.seleniumutility.Seleutil;

import cucumber.api.java.en.Given;

public class Codechargelogin_Definition extends Library{
	Codechargelogin login;
	Seleutil util;
	final static Logger LOG = LogManager.getLogger(Codechargelogin_Definition.class.getName());
	@Given("^The Codecharge page is Launched$")
	public void the_Codecharge_page_is_Launched()throws IOException {
		launchApp();
	LOG.info("browser is launched");
		}
	@Given("^The \"([^\"]*)\" and \"([^\"]*)\" details are entered and login clicked$")
	public void the_and_details_are_entered_and_login_clicked(String uname, String upass) {
			login = new Codechargelogin(driver);
			login.username(uname);
			login.password(upass);
			login.click_loginbutton();
			LOG.info("details are given");
			
	}

	@Given("^The browser is closed$")
	public void the_browser_is_closed(){
		util = new Seleutil(driver);
		util.takeSnapshot("C:/Users/Costco/workspace/codechargedemo/src/test/resources/Screenshot/login.png");
		System.out.println("screenshot taken sucessfully");
		driver.quit();
		LOG.info("browser closed sucessfully");
		
	}
	

}
