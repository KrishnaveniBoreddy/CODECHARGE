package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import freemarker.log.Logger;

public class Codechargeemployee {
	WebDriver driver;
	//Logger LOG=Logger.getLogger(Codechargeemployee.class.getName());
	@FindBy(xpath="/html/body/table[1]/tbody/tr[2]/td[3]/a/img")
	WebElement administrator;
	@FindBy(partialLinkText="Employees")
	WebElement employees;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[27]/td[1]/a")
	WebElement addemployees;
	@FindBy(name="full_name")
	WebElement Name;
	@FindBy(name="email")
	WebElement Email;
	@FindBy(name="login")
	WebElement Login;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(name="security_group_id")
	WebElement securitylevel;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[5]/td/select/option[3]")
	WebElement user;
	@FindBy(name="Insert")
	WebElement add;
	//constructor
	public Codechargeemployee(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	//click the administration icon
	public void loginTo_administration() {
		administrator.click();
		//LOG.info("admin icon is clicked");
		}
	//click on the employees
	public void click_employeeslist() {
		employees.click();
		//LOG.info("employeee list is clicked");
		}
	//add the new user to the employee list
	public void click_addemployees() {
		addemployees.click();
		//LOG.info("add employeee is clicked ");
		}
	//click the new user fullname
	public void employee_name(String fullname) {
		Name.sendKeys(fullname);
		//LOG.info("full name is entered");
    }
	//click on the email
	public void employee_email(String emailid) {
		Email.sendKeys(emailid);
		//LOG.info("emailid is entered");
	}
	//enter the name of employee
		public void employee_login(String name) {
			Login.sendKeys(name);
			//LOG.info("name is entered");
		}
		//enter the password
			public void employee_password(String pwd) {
			Password.sendKeys(pwd);
				//LOG.info("password is entered");
        }
			//click on security level
			public void select_securitylevel() {
				Select dropdown=new Select(securitylevel);
				dropdown.selectByVisibleText("User");
				//driver.findElement(securitylevel).click();
				//LOG.info("new priority is entered");
        }
			//click on add
			public void click_add() {
				add.click();
				//LOG.info("new user is added to employee list");
       }
}
