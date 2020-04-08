package com.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.Codechargelogin;
import com.pages.Codechargetype;
import com.seleniumutility.Seleutil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Codechargetype_Definition extends Library {
	Codechargetype t;
	Seleutil util;
	Codechargelogin l;
	final static Logger LOG = LogManager.getLogger(Codechargetype_Definition.class.getName());
	@Given("^The user launches the browser$")
	public void the_user_launches_the_browser() throws IOException {
		launchApp(); 
	LOG.info("browser is launched"); 
	l=new Codechargelogin(driver);
	l.username("admin");
	l.password("admin");
	l.click_loginbutton();
LOG.info("login successful");
	}

	@Then("^click on type and add details$")
	public void click_on_type_and_add_details()  {
	    t=new Codechargetype(driver);
	    t.click_administrationicon();
	    t.click_types();
	    t.click_addnewtype();
	    t.addingnewtype("report");
	    t.click_add();
	    LOG.info("added new type");
	}

	@Then("^click on add button and submit$")
	public void click_on_add_button_and_submit() {
	    util=new Seleutil(driver);
	    util.takeSnapshot("C:\\Users\\Costco\\workspace\\codechargedemo\\src\\test\\resources\\Screenshot\\type.png");
	    System.out.println("screenshot taken succesful");
	    driver.quit();
	    LOG.info("browser quit successfully");
	}
}
