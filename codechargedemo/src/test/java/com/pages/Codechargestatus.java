package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.log.Logger;

public class Codechargestatus {
	WebDriver driver;
	Logger LOG=Logger.getLogger(Codechargestatus.class.getName());
	@FindBy(xpath="/html/body/table[1]/tbody/tr[2]/td[3]/a/img")
	WebElement administrator;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[4]/td/a")
	WebElement statuses;
	@FindBy(partialLinkText="Add New Status")
	WebElement addnewstatus;
	@FindBy(name="status_name")
	WebElement statusbox;
	@FindBy(name="Insert")
	WebElement add;
//constructor
public Codechargestatus(WebDriver driver) {
PageFactory.initElements(driver, this);
}
//click the administration icon
public void click_administrationicon() {
administrator.click();
}
//click on statuses
public void click_statuses() {
statuses.click();
}
//click on add new status
public void click_addnewstatus() {
addnewstatus.click();
}
//give new status in the status box
public void addingnewstatus(String newstatus) {
statusbox.sendKeys(newstatus);
}
//click on add
public void click_add() {
add.click();
}
}
