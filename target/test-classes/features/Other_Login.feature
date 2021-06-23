@OtherLogin @Regression
Feature: Validate Techfios Login Functionality using scenario outline

Background: 
	Given User is on the Techfios login page  
	
@OtherScenario1 
Scenario Outline: User should be able to login with valid credentials 
	When User enters "<username>" and "<password>"   
	And User clicks on SignIn Button  
	Then User should land on Dashboard page     
	Examples: 
		|username          | password  |
		|demo@techfios.com | abc123    |
		|demo2@techfios.com| abc123    |
		|demo@techfios.com | abc1234   |
		|demo3@techfios.com| abc12345  |
