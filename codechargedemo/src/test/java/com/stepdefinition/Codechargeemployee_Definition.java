package com.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.Codechargeemployee;
import com.pages.Codechargelogin;
import com.seleniumutility.Seleutil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Codechargeemployee_Definition extends Library {
Codechargeemployee e;
Codechargelogin l;
Seleutil util;
final static Logger LOG = LogManager.getLogger(Codechargeemployee_Definition.class.getName());
@Given("^The user launch the browser$")
public void the_user_launch_the_browser() throws IOException {
	launchApp();
 LOG.info("browser is opened");   
 l=new Codechargelogin(driver);
 l.username("admin");
 l.password("admin");
 l.click_loginbutton();
 LOG.info("Login sucessful");
}

@Then("^click on employee and add details$")
public void click_on_employee_and_add_details()  {
 e=new Codechargeemployee(driver);
 e.loginTo_administration();
 e.click_employeeslist();
 e.click_addemployees();
 e.employee_name("KrishnaveniBoreddy");
 e.employee_email("krishna5@gmail.com");
 e.employee_login("krishnaveni");
 e.employee_password("12345");
 e.select_securitylevel();
 e.click_add();
}

@Then("^click add button$")
public void click_add_button()  {
   util=new Seleutil(driver);
   util.takeSnapshot("C:\\Users\\Costco\\workspace\\codechargedemo\\src\\test\\resources\\Screenshot\\employee.png");
  LOG.info("screenshot taken succesfully");
   driver.quit();
   LOG.info("browser is closed");
}
}
