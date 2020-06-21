Feature: Verifying theHut details

  Scenario Outline: Verifying login details with valid credentials
    Given User is on theHut page
    When User enters "<search>"
    And User should click the login button
    And User should click the product
    And User should click the addToCart
    And User should click the view the basket
    And User should click the checkout
    And User should click the "<username>" and "<password>"
    And User should click the submit
    And User should click the secure checkout
   And User should select the enter "<postalCode>","<companyName>","<houseNo>","<add1>","<add2>","<town>","<country>","<contact>"
    And User should select the enter "<creditCardNumber>","<expiryMonth>","<expiryYear>"
    Then User should enter the ccv "<cvvNumber>"

    Examples: 
      | search  | username                 | password     | postalCode | companyName | houseNo | add1                   | add2             | town  | country|contact     |creditCardNumber | expiryMonth | expiryYear     | cvvNumber |
      | watches | varunsathish73@gmail.com | ecommerce100 | 600108     |       water |   house |no123,omr,adayar street |anna nagar,chennai|chennai|India   |9876543210  |9876-1234-1298   |          07 |         22     |       456 |                                                         
