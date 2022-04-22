@datatable
Feature: DataTable Feature
    
  @datatable_step
  Scenario Outline: Create new Customer with email <Username>
    Given Open facebook application
     When Input to Username and Password
      | Username   | Password   | 
      | <Username> | <Password> | 
      And Click to Submit button
      And Close application
  
    Examples: 
      | Username               | Password | 
      | automationfc@gmail.com | 123123   | 
      
       @datatable_scenario @data_driven_testing
  	Scenario Outline: Data Table in Scenario
    Given Open facebook application
    When Input to Username textbox with <Username>
    And Input to Password textbox with <Password>
    And Click to Submit button
    And Close application
    Examples:
    #Mỗi row sẽ là 1 TC với data như bảng dưới
    | Username | Password |
    | automationfc@gmail.com | 123123 |
