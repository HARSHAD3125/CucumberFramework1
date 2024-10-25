#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login

  Scenario: Successful Login with valid Credentials. 
    Given User Launch Chrome browser
    When User Open URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then Page Title Should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page Title Should be "Your store. Login"
    And close browser
    
# Scenario Outline: Successful Login with valid credentials DDT
  #  Given User Launch Chrome browser
   # When User Open URL "https://admin-demo.nopcommerce.com/login"
   # And User enters Email as "<email>" and password as "<password>"
  #  And Click on Login
   # Then Page Title Should be "Dashboard / nopCommerce administration"
  #  When User click on Log out link
  #  Then Page Title Should be "Your store. Login"
  #  And close browser    
    
#Examples:
#|email|password|   
#|admin@yourstore.com| admin|
#|dmin@yourstore.com|admin|
#|admin@yourstore.com|min|    

 