

Feature: As a user i should be able to add items to shopping cart from Amazon

  Scenario: Adding items to shopping cart

    Given user is on the Home Page

    When  user search for a "Dell Laptop"
    And   user filters search with "4 GB" option
    And   user select a "2020 Newest Dell Inspiron 15 3000 PC Laptop"
    And   user check the price is "£456.99"
    And   user adds the "laptop" in the basket
    Then  user sees the "laptop" is in the shopping cart
    When  user search for a "monitor"
    And   user adds the "monitor" in the basket
    Then  user sees the "monitor" is in the shopping cart







