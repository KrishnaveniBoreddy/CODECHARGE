package com.testrunner;



import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	//Iam running with cucumber class
	@RunWith(Cucumber.class)

	@CucumberOptions
	(
			features = "src/test/resources/Features",
					glue = {"com.stepdefinition"},
			plugin = {"pretty", "html:target/cucumber-html-report",
					"json:target/cucumber-json-report",
					"junit:target/cucumber-junit-report",
					"com.cucumber.listener.ExtentCucumberFormatter:target/cucmber-extent-report/Extentreport.html"},
			tags = {"@tc_01_Login,@tc_02_employee,@tc_03_project,@tc_04_status,@tc_05_type"}//@tc_02_customercare,@tc_03_Books,@tc_04_Myaccount"}
					//+ ", @tc_02_Login,"
					//+ " @tc_03_Search, @tc_04_Contactus, "
					//+ "@tc_05_Calender, @tc_6_NextPage"},
			
					//monochrome = true		
	) 
	public class Testrunner 
	{
		@AfterClass
		  public static void extendReport()
		{
			Reporter.loadXMLConfig("src/test/resources/testdata/Extent-config.xml");
		    Reporter.setSystemInfo("user", System.getProperty("user.name"));
		    Reporter.setSystemInfo("os", "Windows");
		    Reporter.setTestRunnerOutput("Sample test runner output message");
		}
	}