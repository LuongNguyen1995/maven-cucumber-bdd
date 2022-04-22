Feature: Register and Login

@register_login
  Scenario: Register to system and login
  #Open Url -> Hooks
    Given Get login page Url 
    When Open register page
    And Input Fistname and Lastname and Email and Password
    And Click to Register button
		Then Register successfully
