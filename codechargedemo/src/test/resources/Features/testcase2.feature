Feature: Codecharge website

@tc_01_Login
Scenario Outline: Check that user can sign in into codecharge page
Given The Codecharge page is Launched
And The "<uname>" and "<upass>" details are entered and login clicked
And The browser is closed
Examples:

		|uname  						|upass       		   | 
		|admin                          |admin        	       |
		|admin123                       |admin        	       |
		|admin                          |admin123        	   |
		
@tc_02_employee
Scenario: Validate employee functionality
Given The user launch the browser
Then click on employee and add details
And click add button

@tc_03_project
Scenario: Validate project functionality
Given The user launched the browser
Then click on project and add details
And click on add button

@tc_04_status
Scenario: Validate status functionality
Given The user had launched the browser
Then click on status and add details
And click on add button and quit

@tc_05_type
Scenario: Validate type functionality
Given The user launches the browser
Then click on type and add details
And click on add button and submit