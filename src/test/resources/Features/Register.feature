Feature: Register

  Background:
    Given User is on the Demo Web Shop homepage "https://demowebshop.tricentis.com/"

  Scenario: Validate Register form
    When User clicks on the "Register" link
    Then User should be navigated to the Register page

#  Scenario: Enter valid credentials into the Register Form
#    When User clicks on the "Register" link
#    And User selects the gender "Male"
#    And User enters the First Name "Surendra"
#    And User enters the Last Name "Sanipineedi"
#    And User enters the Email "nagasurendra193@gmail.com"
#    And User enters the Password "Surendra123@"
#    And User enters the Confirm Password "Surendra123@"
#    And User clicks on the "Register" button
#    Then User should verify the text "Your registration completed"
#    When User clicks on the "Continue" button




