package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.log.Logger;

public class Codechargetype {
	WebDriver driver;
	@FindBy(xpath="/html/body/table[1]/tbody/tr[2]/td[3]/a/img")
	WebElement administrator;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[5]/td/a")
	WebElement types;
	@FindBy(partialLinkText="Add New Type")
	WebElement addnewtype;
	@FindBy(name="type_name")
	WebElement namebox;;
	@FindBy(name="Insert1")
	WebElement add;
//constructor
public Codechargetype(WebDriver driver) {
PageFactory.initElements(driver, this);
}
//click the administration icon
public void click_administrationicon() {
administrator.click();
}
//click on types
public void click_types() {
types.click();
}
//click on add new type
public void click_addnewtype() {
addnewtype.click();
}
//give the new type
public void addingnewtype(String newtype) {
namebox.sendKeys(newtype);
}
//click on add
public void click_add() {
add.click();
}
}
