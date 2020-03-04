Feature: Login
Scenario: User login with original credentials
Given user open browser
When user open url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
Then user get login page "Your store. Login"
And user enter login details username as "admin@yourstore.com" and password as "admin"
And user click on login button
Then user get dashboard page with title "Dashboard / nopCommerce administration"
When user click on logout button
Then user get home page with title "Your store. Login"
And user close browser
