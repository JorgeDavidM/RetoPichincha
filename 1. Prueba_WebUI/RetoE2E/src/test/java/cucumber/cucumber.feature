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

@Author: Jorge Muñoz
Feature: Purchase flow in Demoblaze website (https://www.demoblaze.com/index.html)

  @Scenario: Purchase two products
    Given User is on Demoblaze website
    When Add two products to the cart
    And Check the cart
    And Complete the checkout form
    Then He should see the purchase confirmation pop-up