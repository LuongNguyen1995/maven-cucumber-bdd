@login
Feature: Facebook login page

  @no_param
  Scenario: Scenario have no parameter
    Given Open facebook application
    When Input to Username textbox 
    And Input to Password textbox 
    And Close application
    
  @param_mark
  Scenario: Scenario have no parameter
    Given Open facebook application
    When Input to Username textbox with "automationfc@gmail.com"
    And Input to Password textbox with "123123"
    And Click to Submit button
    And Close application
    
  @param_no_mark
  Scenario: Scenario have no parameter
    Given Open facebook application
    When Input to Username textbox with automationfc@gmail.com
    And Input to Password textbox with 123123
    And Click to Submit button
    And Close application
    
  @mutiple_param
  Scenario: Scenario have parameter
    Given Open facebook application
    When Input to Username textbox with "automationfc@gmail.com" and Password with "123123"
    And Click to Submit button
    And Close application
    
  @datatable_step
  Scenario Outline: Create new Customer with email <Username>
    Given Open facebook application
     When Input to Username and Password
      | Username   | Password   | Address   | 
      | <Username> | <Password> | <Address> | 
      And Click to Submit button
     Then Verify submitted infor displayed
      | Username   | Address   | 
      | <Username> | <Address> | 
      And Close application
  
    Examples: 
      | Username               | Password | City     | Address | Phone      | 
      | automationfc@gmail.com | 123123   | Bac Ninh | Tu Son  | 0999111999 | 