Feature: Product Search

  Background:
    Given User is on the Demo Web Shop homepage "https://demowebshop.tricentis.com/"

  Scenario: Search for a laptop
    When User searches for "14.1-inch Laptop"
    Then Search results should contain "14.1-inch Laptop"

