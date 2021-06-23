@NewAccount 
Feature: Validate Techfios Login Functionality and create New Customer Account

Background: 
	Given User is on the Techfios login page 
	
@NewAccntScenario1 
Scenario Outline: User should be able to login with valid credentials 
	When User enters "<username>" and "<password>"   
	Then User clicks on SignIn Button 
	Then User should land on Dashboard page 
	Then User clicks on Bank & Cash Button 
	Then User clicks on New Account Button
	Then User should land on Add New Account page
	Then User fills out by entering "<AccountTitle>" and "<Description>" and "<InitialBalance>" and "<AccountNumber>" and "<ContactPerson>" and "<Phone>" and "<InternetBankingUrl>"
	And User Clicks on Submit Button
	Examples: 
		|username          | password  | AccountTitle | Description | InitialBalance | AccountNumber | ContactPerson | Phone      | InternetBankingUrl   |
		|demo@techfios.com | abc123    | Checking     | Personal    | 25000          | 2233445       | Bobby         | 2223334545 | www.banking.com      |