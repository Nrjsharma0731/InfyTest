$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Checkout.feature");
formatter.feature({
  "line": 3,
  "name": "Checkout some product to buy",
  "description": "",
  "id": "checkout-some-product-to-buy",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag2"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "add product to cart",
  "description": "",
  "id": "checkout-some-product-to-buy;add-product-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user select a product and add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user go to payment page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "verify the selected product",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("Register.feature");
formatter.feature({
  "line": 3,
  "name": "Register for new user",
  "description": "",
  "id": "register-for-new-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag1"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Create a account for new user",
  "description": "",
  "id": "register-for-new-user;create-a-account-for-new-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user is on website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Click Signin on the landing page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Create Account by entering email address",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Enter details on the Your Personal Information",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User account is created and logged in app",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterTest.user_is_on_website()"
});
formatter.result({
  "duration": 16296945200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTest.click_Signin_on_the_landing_page()"
});
formatter.result({
  "duration": 2478710300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTest.create_Account_by_entering_email_address()"
});
formatter.result({
  "duration": 2439543400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTest.enter_details_on_the_Your_Personal_Information()"
});
formatter.result({
  "duration": 1919404299,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//input[@id\u003d\"id_gender1\"]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-6EOENUHD\u0027, ip: \u0027192.168.1.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdefinations.RegisterTest.enter_details_on_the_Your_Personal_Information(RegisterTest.java:73)\r\n\tat ✽.And Enter details on the Your Personal Information(Register.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "RegisterTest.user_account_is_created_and_logged_in_app()"
});
formatter.result({
  "status": "skipped"
});
});