Feature: Login

  Background:
    Given User is on the Demo Web Shop homepage "https://demowebshop.tricentis.com/"
    When User clicks on the "Log in" link
    And User enters the Email "nagasurendra123@gmail.com"
    And User enters the Password "Surendra123@"

  Scenario: Enter valid Credentials to the Login Form
    When User clicks on the Checkbox "Remember me?"
    And User clicks on the "Log in" button

#    Scenario: Add the products into the Cart
#      When User clicks on the Checkbox "Remember me?"
#      And User clicks on the "Log in" button
#      And User should scroll and select the product "$25 Virtual Gift Card" into the add to cart
#      And User enters the Recipient name "Surendra"
#      And User enter the Recipient email "nagasurendra123@gmail.com"
#      And User click on the "Add to cart" button
#      Then User should verify the message "The product has been added to your shopping cart"




