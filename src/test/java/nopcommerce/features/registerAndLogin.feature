Feature: Register/Login and new Customer

#@register_login
 # Scenario: Register to system and login
  #Open Url -> Hooks
   # Given Get login page Url 
    #When Open register page
    #And Input Fistname and Lastname and Email and Password
    #And Click to Register button
		#Then Register successfully
		
		@new_customer
		Scenario Outline: Register to system with dynamic page
		Given Open "Register" Page
		When Input to "FirstName" textbox with value "<FirstName>"
		And Input to "LastName" textbox with value "<LastName>"
		And Input to "Email" textbox with value "<Email>"
		And Input to "Password" textbox with value "<Password>"
		And Input to "ConfirmPassword" textbox with value "<ConfirmPassword>"
		And Click to "Register" button
		Then Verify Register successfully "Your registration completed"
		
		Examples:
      | FirstName | LastName | Email                                                 | Password | ConfirmPassword | 
      | Luong       | Nguyen    | luongnguyen123123@gmail.com | 123123    | 123123                   | 
      
