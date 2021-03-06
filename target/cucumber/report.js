$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Techfios Login Functionality",
  "description": "",
  "id": "validate-techfios-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 14762493500,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.User_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 3753722200,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "User should be able to login with valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@Scenario5"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "User enters username from database",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User enters password from database",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "User clicks on SignIn Button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.User_enters_username_from_database()"
});
formatter.result({
  "duration": 2219216600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.User_enters_password_from_database()"
});
formatter.result({
  "duration": 743808400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_on_SignIn_Button()"
});
formatter.result({
  "duration": 2851356300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 16375200,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Dashboard]- iBilling\u003e but was:\u003c[Login ]- iBilling\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat steps.LoginStepDefinitions.user_should_land_on_Dashboard_page(LoginStepDefinitions.java:63)\r\n\tat ???.Then User should land on Dashboard page(features/Login.feature:40)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1117050900,
  "status": "passed"
});
});