@UITesting
Feature: homepage validation
	Scenario: website title validation
	Given open chrome browser and enter URL
	When opens website
	Then validate title
	
	
	Scenario: title validation of Dynamic ID
	Given click on dynamic id
	When opens page
	Then validate page title
 
 Scenario: title validation of ClassAttribute
	Given click on ClassAttribute
	When opens page ClassAttribute
	Then validate page title of ClassAttribute and button
 
 
 Scenario: title validation of HiddenLayer
	Given click on HiddenLayer
	When opens page HiddenLayer
	Then validate page title of HiddenLayer and button testing
 
 
 Scenario: testing LoadDelay
	Given click on LoadDelay
	When opens page LoadDelay
	Then test the button after delay
	
 
 Scenario: testing AJAX 
	Given click on AJAX
	When opens page AJAX
	Then test the button after opeaning AJAX


 Scenario: testing Client Side Delay
	Given click on Client Side Delay
	When opens page Client Side Delay
	Then test the button after opeaning Client Side Delay
	
	
 Scenario: testing Click
	Given click on Click button
	When opens page Click
	Then test the DOM Click Event button
	
	
 Scenario: testing Text Input
	Given click on Text Input
	When opens page Text Input
	Then test the button after opeaning Text Input


 