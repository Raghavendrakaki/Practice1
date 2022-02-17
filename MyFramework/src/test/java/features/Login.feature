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
@tag
Feature: Application Login

  @tag1
  Scenario: Homepage default Login
    Given User is on Landing page / Login page
   # And having credentials username and password
    When User login  into application with username "Raghav" and password "RaghavPwd"
    Then Homepage should display
    And Username is displayed on Homepage "true"
@tag2
  Scenario: Homepage default Login
    Given User is on Landing page / Login page
   # And having credentials username and password
    When User login  into application with username "Raghav2" and password "RaghavPwd2"
    Then Homepage should display
    And Username is displayed on Homepage "false"
 