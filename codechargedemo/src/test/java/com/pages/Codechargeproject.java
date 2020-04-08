package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.log.Logger;

public class Codechargeproject {
	WebDriver driver;
	Logger LOG=Logger.getLogger(Codechargeproject.class.getName());
	@FindBy(xpath="/html/body/table[1]/tbody/tr[2]/td[3]/a/img")
	WebElement administrator;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[3]/td/a")
	WebElement myproject;
	@FindBy(partialLinkText="Add New Project")
	WebElement addnewproject;
	@FindBy(name="project_name")
	WebElement addnewproject_box;
	@FindBy(name="Insert")
	WebElement add;
	//constructor
	public Codechargeproject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	//click the administration icon
		public void click_administrationicon() {
			administrator.click();
			}
	//click on myproject
		public void click_project() {
		myproject.click();
		}
		//click on add new project
		public void click_addnewproject() {
		addnewproject.click();
		}
		//add the new priority
		public void addingnewproject(String newvalue) {
		addnewproject_box.sendKeys(newvalue);
			}
		//click on add
		public void click_add() {
			add.click();
			}
}
