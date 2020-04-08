package com.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.Codechargelogin;
import com.pages.Codechargeproject;
import com.seleniumutility.Seleutil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Codechargeproject_Definition extends Library {
Codechargeproject p;
Seleutil util;
Codechargelogin l;
final static Logger LOG = LogManager.getLogger(Codechargeproject_Definition.class.getName());
@Given("^The user launched the browser$")
public void the_user_launched_the_browser() throws IOException {
	launchApp(); 
	LOG.info("browser is launched");
	l=new Codechargelogin(driver);
	l.username("admin");
	l.password("admin");
	l.click_loginbutton();
	LOG.info("login successful");
}

@Then("^click on project and add details$")
public void click_on_project_and_add_details()  {
  p=new Codechargeproject(driver);
  p.click_administrationicon();
  p.click_project();
  p.click_addnewproject();
  p.addingnewproject("automation testing");
  p.click_add();
  LOG.info("new project is added");
}

@Then("^click on add button$")
public void click_on_add_button() {
  util=new Seleutil(driver);
  util.takeSnapshot("C:\\Users\\Costco\\workspace\\codechargedemo\\src\\test\\resources\\Screenshot\\project.png");
  LOG.info("screenshot taken succesful");
  driver.quit();
  LOG.info("browser quit succesful");
}
}
