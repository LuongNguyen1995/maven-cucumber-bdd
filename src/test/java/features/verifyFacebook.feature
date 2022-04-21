@parameter
Feature: Parameter Feature
#Background:
	#Given Open facebook application

  @no_param
  Scenario: Scenario have no parameter
   # Given Open facebook application
    When Input to Username textbox 
    And Input to Password textbox 
    #And Close application
    
    #Phổ biến hơn
  @param_mark
  Scenario: Scenario have no parameter
    #Given Open facebook application
    When Input to Username textbox with "automationfc@gmail.com"
    And Input to Password textbox with "123123"
    And Click to Submit button
   # And Close application
    
    #không nên dùng cách này, dễ gây hiểu nhầm
  @param_no_mark
  Scenario: Scenario have no parameter
    #Given Open facebook application
    When Input to Username textbox with automationfc@gmail.com
    And Input to Password textbox with 123123
    And Click to Submit button
    #And Close application
    
  @mutiple_param
  Scenario: Scenario have parameter
    #Given Open facebook application
    When Input to Username textbox with "automationfc@gmail.com" and Password with "123123"
    And Click to Submit button
    #And Close application
    
  @datatable_step
  Scenario Outline: Create new Customer with email <Username>
    #Given Open facebook application
     When Input to Username and Password
      | Username   | Password   | 
      | automationtest01@gmail.com | 123123 | 
      | automationtest02@gmail.com | 123123 | 
      | automationtest03@gmail.com | 123123 | 
      And Click to Submit button
      #And Close application
  
    Examples: 
      | Username               | Password | 
      | automationfc@gmail.com | 123123   | 
      
       @datatable_scenario
  	Scenario Outline: Data Table in Scenario
    #Given Open facebook application
    When Input to Username textbox with <Username>
    And Input to Password textbox with <Password>
    And Click to Submit button
    #And Close application
    Examples:
    #Mỗi row sẽ là 1 TC với data như bảng dưới
    | Username | Password |
    | automationfc@gmail.com | 123123 |
    | abc123312ok@gmail.com | 123123 | 