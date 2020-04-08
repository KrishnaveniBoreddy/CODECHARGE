package com.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.Codechargelogin;
import com.pages.Codechargestatus;
import com.seleniumutility.Seleutil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Codechargestatus_Definition extends Library {
	Codechargestatus s;
	Seleutil util;
	Codechargelogin l;
	final static Logger LOG = LogManager.getLogger(Codechargestatus_Definition.class.getName());
	@Given("^The user had launched the browser$")
	public void the_user_had_launched_the_browser() throws IOException {
		launchApp(); 
	   LOG.info("browser is launched");
	   l=new Codechargelogin(driver);
	   l.username("admin");
	   l.password("admin");
	   l.click_loginbutton();
	   LOG.info("login successful");
	}

	@Then("^click on status and add details$")
	public void click_on_status_and_add_details()  {
	  s=new Codechargestatus(driver);
	  s.click_administrationicon();
	  s.click_statuses();
	  s.click_addnewstatus();
	  s.addingnewstatus("modest");
	  s.click_add();
	  LOG.info("new status added succesfully");
	}

	@Then("^click on add button and quit$")
	public void click_on_add_button_and_quit()  {
	  util=new Seleutil(driver);
	  util.takeSnapshot("C:\\Users\\Costco\\workspace\\codechargedemo\\src\\test\\resources\\Screenshot\\status.png");
	  System.out.println("screenshot taken succesfully");
	  driver.quit();
	  LOG.info("browser quit succesful");
	}

}
