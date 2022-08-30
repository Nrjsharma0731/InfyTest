
 @tag1
Feature: A Register for new user
  

 
  Scenario: Create a account for new user
    Given user is on website
    And Click Signin on the landing page
    When Create Account by entering email address
    And Enter details on the Your Personal Information
    Then User account is created and logged in app
    

 
