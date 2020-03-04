$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FeatureFiles/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User login with original credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user open browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.Steps.user_open_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open url \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.Steps.user_open_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user get login page \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Steps.user_get_login_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter login details username as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Steps.user_enter_login_details_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Steps.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user get dashboard page with title \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Steps.user_get_dashboard_page_with_title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on logout button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.Steps.user_click_on_logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user get home page with title \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Steps.user_get_home_page_with_title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Steps.user_close_browser()"
});
formatter.result({
  "status": "passed"
});
});