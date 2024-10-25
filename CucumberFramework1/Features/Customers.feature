
@tag
Feature: Customer

  @tag1
  Scenario: Add New Customer
    Given User Launch Chrome browser
    When User Open URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then User can view Dashboard
    When User click on customers menu
    And Click on customers menu item
    And Click on Add new button
    Then User can view Add new customer page
    When User enter customer info
    And Click on save button
    Then User can view confirmation message "The new customer has been added successfully."
    And close browser
    
   Scenario: Search Customer by Email
    Given User Launch Chrome browser
    When User Open URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then User can view Dashboard
    When User click on customers menu
    And Click on customers menu item
    And Enter customer EMail
	  When Click on search button
	  Then User should found Email in the Search table
  	And close browser 
  