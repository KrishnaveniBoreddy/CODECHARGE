package com.seleniumutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.stepdefinition.Codechargeemployee_Definition;

public class Seleutil {
	WebDriver driver;
	final static Logger LOG = LogManager.getLogger(Seleutil.class.getName());
	//constructor
	public Seleutil(WebDriver driver)
	{
	this.driver=driver;

	}
	//to take screenshot
	public void takeSnapshot(String path1) {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File Source=ts.getScreenshotAs(OutputType.FILE);
	try {
	FileUtils.copyFile(Source, new File(path1));
	}
	catch(IOException e) {
	e.printStackTrace();
	}
	}
}
